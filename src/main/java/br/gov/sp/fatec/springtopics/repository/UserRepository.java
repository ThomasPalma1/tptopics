package br.gov.sp.fatec.springtopics.repository;

import br.gov.sp.fatec.springtopics.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByName(String name);
}