package br.gov.sp.fatec.springtopics.controller;

import br.gov.sp.fatec.springtopics.entity.Annotation;
import br.gov.sp.fatec.springtopics.service.InterfaceAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/annotation")
public class AnnotationController {

    @Autowired
    private InterfaceAnnotationService service;

    @GetMapping
    public List<Annotation> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Annotation newAnnotation(@RequestBody Annotation annotation) {
        return service.newAnnotation(annotation);
    }
}
