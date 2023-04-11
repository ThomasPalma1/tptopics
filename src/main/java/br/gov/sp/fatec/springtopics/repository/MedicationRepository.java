package br.gov.sp.fatec.springtopics.repository;

import br.gov.sp.fatec.springtopics.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
