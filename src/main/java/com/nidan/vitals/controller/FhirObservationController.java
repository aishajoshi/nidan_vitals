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

    // POST /api/fhir/observation
    @PostMapping
    public FhirObservationEntity create(@RequestBody FhirObservationEntity observation) {
        return service.save(observation);
    }

    // GET /api/fhir/observation
    @GetMapping
    public List<FhirObservationEntity> getAll(
            @RequestParam(required = false) String patientId,
            @RequestParam(required = false) String bmiCategory
    ) {
        if (patientId != null) {
            return service.searchByPatient(patientId);
        }
        if (bmiCategory != null) {
            return service.filterByBmi(bmiCategory);
        }
        return service.getAll();
    }
}
