CREATE DATABASE nidan_vitals_db;
USE nidan_vitals_db;

CREATE TABLE fhir_observation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id VARCHAR(50) NOT NULL,
     resource_type VARCHAR(20) DEFAULT 'Observation',
     loinc_code VARCHAR(20) DEFAULT '85353-1',
     height_cm DECIMAL(5,2),
     weight_kg DECIMAL(5,2),
     bmi DECIMAL(5,2),
     systolic_bp INT,
     diastolic_bp INT,
     bmi_category VARCHAR(20),
     risk_status VARCHAR(20),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
