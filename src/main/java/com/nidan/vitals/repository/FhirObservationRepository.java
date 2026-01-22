package com.nidan.vitals.repository;

import com.nidan.vitals.entity.FhirObservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FhirObservationRepository
        extends JpaRepository<FhirObservationEntity, Long> {

    List<FhirObservationEntity> findByPatientId(String patientId);

    List<FhirObservationEntity> findByBmiCategory(String bmiCategory);
}
