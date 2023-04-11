package br.gov.sp.fatec.springtopics.service;

import br.gov.sp.fatec.springtopics.entity.User;
import br.gov.sp.fatec.springtopics.exception.UserNotFoundException;
import br.gov.sp.fatec.springtopics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements InterfaceUserService {

    @Autowired
    private UserRepository userRepo;

    public User newUser(User user) {
        if (user == null
                || user.getName() == null
                || user.getPassword() == null) {
            throw new UserNotFoundException("The name or password is invalid!");
        }
        return userRepo.save(user);
    }

    @Override
    public List<User> searchForAllUsers() {

        return userRepo.findAll();
    }

    public List<User> fetchAllUsers() {

        return userRepo.findAll();
    }

    public User userFindByID(Long id) {
        Optional<User> userOp = userRepo.findById(id);
        if (userOp.isEmpty()) {
            throw new IllegalArgumentException("User does not exist");
        }
        return userOp.get();
    }

}
