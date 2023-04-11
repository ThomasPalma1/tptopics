package br.gov.sp.fatec.springtopics.service;


import br.gov.sp.fatec.springtopics.entity.Medication;


import java.util.List;

public interface InterfaceMedicationService {

    public Medication newMedication(Medication medication);

    public List<Medication> findAll();

    public List<Medication> searchForAllMedications();

    public Medication medicationFindById(Long id);
}
