package com.nidan.vitals.service;

import com.nidan.vitals.entity.FhirObservationEntity;
import com.nidan.vitals.repository.FhirObservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FhirObservationService {

    private final FhirObservationRepository repository;

    public FhirObservationService(FhirObservationRepository repository) {
        this.repository = repository;
    }

    public FhirObservationEntity save(FhirObservationEntity obs) {

        // BMI category logic
        if (obs.getBmi() != null) {
            if (obs.getBmi() >= 30) obs.setBmiCategory("Obese");
            else if (obs.getBmi() >= 25) obs.setBmiCategory("Overweight");
            else obs.setBmiCategory("Normal");
        }

        // Risk logic
        if ((obs.getBmi() != null && obs.getBmi() >= 30) ||
                (obs.getSystolicBp() != null && obs.getSystolicBp() >= 140)) {
            obs.setRiskStatus("Red");
        } else {
            obs.setRiskStatus("Green");
        }

        return repository.save(obs);
    }

    public List<FhirObservationEntity> getAll() {
        return repository.findAll();
    }

    public List<FhirObservationEntity> searchByPatient(String patientId) {
        return repository.findByPatientId(patientId);
    }

    public List<FhirObservationEntity> filterByBmi(String category) {
        return repository.findByBmiCategory(category);
    }
}
