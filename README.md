A Spring Boot web application that searches, stores, and manages information about TV series and episodes using an external movie API.

The system consumes data from an external API, converts the JSON responses into Java objects, and persists the information into a PostgreSQL database using Spring Data JPA.

This project was developed to practice backend development with Java and Spring Boot, focusing on API integration, data persistence, and application architecture.

Features

✔ Search TV series using an external API
✔ Store series data in a PostgreSQL database
✔ Retrieve stored series information
✔ Manage seasons and episodes data
✔ Convert JSON responses into Java objects
✔ Structured backend architecture with Spring Boot

Tech Stack
Technology	Purpose
Java	Main programming language
Spring Boot	Backend framework
Spring Data JPA	Database interaction
Hibernate	ORM
PostgreSQL	Database
Jackson	JSON serialization/deserialization
Maven	Dependency management
Concepts Practiced

This project applies several important backend concepts:

REST API consumption
JSON deserialization
Entity modeling
Database persistence with JPA
Repository pattern
Service layer architecture
Object mapping
Clean backend structure
Architecture Overview

The project follows a layered architecture commonly used in backend applications.

src
 ├── model
 │    ├── Serie.java
 │    ├── Episodio.java
 │    └── DadosSerie.java
 │
 ├── repository
 │    └── SerieRepository.java
 │
 ├── service
 │    ├── ConsumoApi.java
 │    └── ConverteDados.java
 │
 ├── principal
 │    └── Principal.java
 │
 └── ScreenmatchWebApplication.java
External API

The application consumes data from a movie/series API that returns information such as:

Title
Total seasons
Rating
Poster
Plot
Episode information

The responses are converted to Java objects using Jackson.

Create a PostgreSQL database:

screenmatch

Example configuration:

spring.datasource.url=jdbc:postgresql://localhost:5432/screenmatch
spring.datasource.username=your_user
spring.datasource.password=your_password
Run the application

Run the Spring Boot application:

ScreenmatchWebApplication.java

Spring Boot will automatically:

start the application
connect to the database
create tables if necessary
Example Data

Example series stored in the database:

Series: Breaking Bad
Seasons: 5
Rating: 9.5
Episodes: Multiple episodes per season
Learning Goals

This project was created to strengthen skills in:

Java backend development
Spring Boot framework
API integration
database persistence
software architecture
📚 Project Origin

This project was initially developed as part of a Java backend course, with additional documentation and improvements added by me.
