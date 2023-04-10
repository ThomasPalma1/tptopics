package br.gov.sp.fatec.springtopics.service;

import br.gov.sp.fatec.springtopics.entity.Annotation;

import java.util.List;

public interface InterfaceAnnotationService {

    public Annotation newAnnotation(Annotation annotation);

    public List<Annotation> findAll();
}
