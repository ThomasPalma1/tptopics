package br.gov.sp.fatec.springtopics.controller;


import br.gov.sp.fatec.springtopics.entity.Medication;
import br.gov.sp.fatec.springtopics.service.InterfaceMedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/medication")
public class MedicationController {

    @Autowired
    private InterfaceMedicationService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Medication newMedication(@RequestBody Medication medication) {
        return service.newMedication(medication);
    }


    @GetMapping(value = "/all_medications")
    public List<Medication> searchForAllMedications() {
        return service.findAll();
    }

    @GetMapping(value = "/id/{medication}")
    public Medication medicationFindById(@PathVariable("medication") Long id) {

        return service.medicationFindById(id);
    }
}
