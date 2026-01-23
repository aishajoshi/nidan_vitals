Project Overview
Nidan Vitals is a simple full-stack healthcare application designed to record and manage patient vitals such as height, weight, BMI, and blood pressure.
The backend exposes REST APIs that accept and return data in a FHIR-like Observation structure, and the system stores vitals in a MySQL database.
Tech stack
Backend
Java 17
Spring Boot 3
Spring Data JPA
MySQL 8
Gradle
REST APIs (JSON)
Database
MySQL
SQL schema managed via db.sql
Running the backend:
Java 17 installed
MySQL running locally
Database created using db.sql
Steps
Open project in IntelliJ IDEA
Ensure MySQL credentials are set in application.properties
Run:NidanVitalsApplication.java
(frontend is planned but not done yet)
(i did not write each line of code myself i used the AI tools but not copied blindly, i understand the structure)
change made for pr

