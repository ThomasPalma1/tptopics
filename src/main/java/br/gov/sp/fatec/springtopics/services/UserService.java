package br.gov.sp.fatec.springtopics.services;

import br.gov.sp.fatec.springtopics.entity.User;
import br.gov.sp.fatec.springtopics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User newUser(User user) {
        if (user == null
                || user.getName() == null
                || user.getPassword() == null) {
            throw new IllegalArgumentException("Invalid name and password");
        }
        return userRepo.save(user);
    }

    public List<User> fetchAllUsers() {
        return userRepo.findAll();
    }
}
