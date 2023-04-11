package br.gov.sp.fatec.springtopics.service;


import br.gov.sp.fatec.springtopics.entity.Medication;

import br.gov.sp.fatec.springtopics.entity.User;
import br.gov.sp.fatec.springtopics.exception.MissingFieldException;
import br.gov.sp.fatec.springtopics.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicationService implements InterfaceMedicationService {

    @Autowired
    private MedicationRepository medicationRepo;

    public Medication newMedication(Medication medication) {
        if (medication == null
                || medication.getMedicationStatus() == null) {
            throw new MissingFieldException("Medication status is required!");
        }
        return medicationRepo.save(medication);
    }

    @Override
    public List<Medication> findAll() {
        return medicationRepo.findAll();
    }

    @Override
    public List<Medication> searchForAllMedications() {

        return medicationRepo.findAll();
    }

    public Medication medicationFindById(Long id) {
        Optional<Medication> medicationOp = medicationRepo.findById(id);
        if (medicationOp.isEmpty()) {
            throw new IllegalArgumentException("Medication does not exist");
        }
        return medicationOp.get();
    }
}
