package br.gov.sp.fatec.springtopics.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "mdc_medication")
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mdc_id")
    private Long id;

    @Column(name = "mdc_date_and_time")
    private Date medicationDatetime;

    @Column(name = "mdc_temperature")
    private Double medicationTemperature;

    @Column(name = "mdc_humidity")
    private Double medicationHumidity;

    @Column(name = "mdc_particles")
    private Double medicationParticles;

    @Column(name = "mdc_status")
    private String medicationStatus;

    @Column(name = "mdc_processing_date")
    private LocalDateTime medicationProcessingDate;

    public Medication() {
        // Empty Constructor
    }

    public Medication(String status) {
        setMedicationStatus(status);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Date getMedicationDatetime() {

        return medicationDatetime;
    }

    public void setMedicationDatetime(Date medicationDatetime) {

        this.medicationDatetime = medicationDatetime;
    }

    public Double getMedicationTemperature() {

        return medicationTemperature;
    }

    public void setMedicationTemperature(Double medicationTemperature) {
        this.medicationTemperature = medicationTemperature;
    }

    public Double getMedicationHumidity() {

        return medicationHumidity;
    }

    public void setMedicationHumidity(Double medicationHumidity) {
        this.medicationHumidity = medicationHumidity;
    }

    public Double getMedicationParticles() {

        return medicationParticles;
    }

    public void setMedicationParticles(Double medicationParticles) {

        this.medicationParticles = medicationParticles;
    }

    public String getMedicationStatus() {
        return medicationStatus;
    }

    public void setMedicationStatus(String medicationStatus) {

        this.medicationStatus = medicationStatus;
    }

    public LocalDateTime getMedicationProcessingDate() {

        return medicationProcessingDate;
    }

    public void setMedicationProcessingDate(LocalDateTime medicationProcessingDate) {
        this.medicationProcessingDate = medicationProcessingDate;
    }

}
