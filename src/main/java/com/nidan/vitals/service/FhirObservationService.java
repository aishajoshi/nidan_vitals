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

    public FhirObservationEntity save(FhirObservationEntity entity) {
        return repository.save(entity);
    }

    public List<FhirObservationEntity> getAll() {
        return repository.findAll();
    }

    public List<FhirObservationEntity> getByRisk(String risk) {
        return repository.findByRiskStatus(risk);
    }

    public List<FhirObservationEntity> getByPatient(String patientId) {
        return repository.findByPatientId(patientId);
    }
}
