package br.gov.sp.fatec.springtopics.repository;

import br.gov.sp.fatec.springtopics.entity.Authorization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorizationRepository extends JpaRepository<Authorization, Long> {

}
