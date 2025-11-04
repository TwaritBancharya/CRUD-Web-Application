# Spring Boot CRUD App (User Management)

## Features
- Java 17, Spring Boot 3
- Thymeleaf server-side templates
- Spring Data JPA (Hibernate)
- MySQL connector
- Basic Create / Read / Update / Delete operations for User entity

## How to run
1. Ensure Java 17 and Maven are installed.
2. Create a MySQL database (example):sql

   CREATE DATABASE crud_db;
   CREATE USER 'cruduser'@'localhost' IDENTIFIED BY 'changeme';
   GRANT ALL PRIVILEGES ON crud_db.* TO 'cruduser'@'localhost';
   FLUSH PRIVILEGES;
   
3. Update `src/main/resources/application.properties` with your DB credentials.
4. Run:
   
   mvn clean package
   mvn spring-boot:run
   
5. Open http://localhost:8080

