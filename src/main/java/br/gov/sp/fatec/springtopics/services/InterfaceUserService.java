package br.gov.sp.fatec.springtopics.services;


import java.util.List;

import br.gov.sp.fatec.springtopics.entity.User;


public interface InterfaceUserService {

    public User newUser(User user);

    public List<User> searchForAllUsers();

    public User userFindByID(Long id);
}