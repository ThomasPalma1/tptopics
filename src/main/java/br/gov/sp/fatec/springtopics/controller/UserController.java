package br.gov.sp.fatec.springtopics.controller;

import br.gov.sp.fatec.springtopics.entity.User;
import br.gov.sp.fatec.springtopics.services.InterfaceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/user")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private InterfaceUserService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public User newUser(@RequestBody User user) {
        return service.newUser(user);
    }

    @GetMapping
    public List<User> searchForAllUsers() {
        return service.searchForAllUsers();
    }

    @GetMapping(value = "/id/{user}")
    public User userFindByID(@PathVariable("user") Long id) {
        return service.userFindByID(id);
    }
}

