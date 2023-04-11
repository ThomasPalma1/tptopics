package br.gov.sp.fatec.springtopics.repository;

import br.gov.sp.fatec.springtopics.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
