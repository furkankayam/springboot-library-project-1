# Spring Boot `Library Project-1`

<div align="center">
<a href="https://www.youtube.com/live/DqzB4eIy5EU?si=lTdfmUKEQEJF7L6N">
  <img src="./images/youtube-image.jpg" alt="YOUTUBE LIVE" width="400" height="400">
</a>
</div>

- [YouTube](https://www.youtube.com/live/DqzB4eIy5EU?si=lTdfmUKEQEJF7L6N)

- Simple book inventory application has been developed using Spring Boot, and in addition to the previous project, the entity classes have been written in Kotlin.

<br>

This project is based on the Spring Boot project and uses these packages:

[![Java](https://img.shields.io/badge/java-19.0-000?style=for-the-badge&logo=openjdk&logoColor=white&color=FF9A00)](https://www.java.com/en/)

[![Kotlin](https://img.shields.io/badge/kotlin-1.9-000?style=for-the-badge&logo=kotlin&logoColor=white&color=7F52FF)](https://kotlinlang.org/)

[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15.0-000?style=for-the-badge&logo=postgresql&logoColor=white&color=4479A1)](https://www.postgresql.org/)

[![IntellijIDEA](https://img.shields.io/badge/Intellij%20idea%20(Ultimate)-2022.3-000?style=for-the-badge&logo=intellij-idea&logoColor=white&color=A75499)](https://www.jetbrains.com/idea/)

[![Maven](https://img.shields.io/badge/Maven-3.9-C70D2C?style=for-the-badge&logo=apache-maven&color=CE293C)](https://maven.apache.org/)

[![Spring Boot](https://img.shields.io/badge/spring%20boot-3.1-000?style=for-the-badge&logo=springboot&logoColor=white&color=6DB33F)](https://spring.io/)

[![Mapstruct](https://img.shields.io/badge/mapstruct-1.5-C70D2C?style=for-the-badge&logo=mapstruct&logoColor=white&color=C02128)](https://mapstruct.org/)

[![Insomnia](https://img.shields.io/badge/Insomnia-2023.1-C70D2C?style=for-the-badge&logo=insomnia&logoColor=white&color=4000BF)](https://insomnia.rest/)

[![Open API](https://img.shields.io/badge/Open%20API-2.1-85EA2D?style=for-the-badge&logo=openapiinitiative&logoColor=white&color=6BA539)](https://www.openapis.org/)

<br>

### Installation

- The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

<br>

### Database configuration

- Create a PostgreSQL database with the name `springboot_library_project_1` and add the credentials to `/resources/application.yml`

The default ones are :

```yml

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/springboot_library_project_1
    username: postgres
    password: ****

```

<br>

### Usage

Run the project through the IDE and head out to `http://localhost:8080/`
or
run this command in the command line:

```bsh
mvn spring-boot:run
```

<br>

# License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details

Created by [Mehmet Furkan KAYA](https://www.linkedin.com/in/mehmet-furkan-kaya/)
