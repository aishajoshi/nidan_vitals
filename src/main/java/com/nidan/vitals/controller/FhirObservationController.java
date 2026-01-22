package com.nidan.vitals.controller;

import com.nidan.vitals.entity.FhirObservationEntity;
import com.nidan.vitals.service.FhirObservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fhir/observation")
public class FhirObservationController {

    private final FhirObservationService service;

    public FhirObservationController(FhirObservationService service) {
        this.service = service;
    }

    @PostMapping
    public FhirObservationEntity create(@RequestBody FhirObservationEntity entity) {
        return service.save(entity);
    }

    @GetMapping
    public List<FhirObservationEntity> getAll(
            @RequestParam(required = false) String risk,
            @RequestParam(required = false) String patientId) {

        if (risk != null) return service.getByRisk(risk);
        if (patientId != null) return service.getByPatient(patientId);

        return service.getAll();
    }
}
