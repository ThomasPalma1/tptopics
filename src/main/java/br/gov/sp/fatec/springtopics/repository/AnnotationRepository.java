package br.gov.sp.fatec.springtopics.repository;

import br.gov.sp.fatec.springtopics.entity.Annotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnotationRepository extends JpaRepository<Annotation, Long> {
}
