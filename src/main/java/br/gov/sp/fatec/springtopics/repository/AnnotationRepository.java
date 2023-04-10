package br.gov.sp.fatec.springtopics.repository;

import br.gov.sp.fatec.springtopics.entity.Annotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.*;
import java.util.List;

public interface AnnotationRepository extends JpaRepository<Annotation, Long> {
//    There are two ways to perform the query.
//    The first one is directly from Spring
//    And the second is using the Query method, which is also from Spring.

    // public List<Annotation> findByTextContains(String text);

    @Query("select a from Annotation a where a.text like %?1%")
    public List<Annotation> findByText(String text);

    // public List<Annotation> findByUsername(String nameUser);

    @Query("select a from Annotation a join a.usuario u where u.name = ?1")
    public List<Annotation> findByUsername(String nameUser);
}
