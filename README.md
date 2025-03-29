# Software Engineering API - Spring Boot

This project is a Spring Boot-based API designed to provide information about students and subjects associated with a Software Engineering program. The API includes two main endpoints:

- `/students`: Provides a list of students and their enrolled programs.
- `/subjects`: Lists subjects for the Software Engineering program, organized by academic year.

## Project Structure


spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect


mvn clean install

mvn spring-boot:run


http://localhost:8080/swagger-ui.html


Online Demo  For swagger UI

http://ec2-13-60-49-40.eu-north-1.compute.amazonaws.com:8080/swagger-ui/index.html

or

http://13.60.49.40:8080/swagger-ui/index.html

For Testing


http://13.60.49.40:8080/student/getall



