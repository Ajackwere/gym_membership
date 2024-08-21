# Gym Membership App
The Gym Membership App is a RESTful API built using Java Spring Boot, which allows you to manage gym memberships, including creating, updating, and retrieving member information, membership plans, and subscriptions.
## Table of Contents

- Features
- Technologies Used
- Getting Started

- Prerequisites
- Installation


- API Documentation
- Testing
- Deployment
- Contributing
- License

## Features

Create, update, and retrieve gym members
Manage membership plans with details like name, description, duration, and price
Handle member subscriptions, including start and end dates
Validate member subscription status before allowing actions
Provide REST API endpoints for all CRUD operations

## Technologies Used

Java 11
Spring Boot
Spring Web
Spring Data JPA
Maven
Swagger/OpenAPI for API documentation
JUnit and Mockito for testing

## Getting Started
### Prerequisites

Java 11 or higher
Maven 3.x

# Installation

1. Clone the repository
2. Navigate to the project directory:
3. Build the app using Maven: **mvn clean install**
4. Run the app using: **mvn spring-boot:run**

5. The application will start running on http://localhost:8080.

API Documentation
The API documentation is generated using Swagger/OpenAPI. You can access the documentation at http://localhost:8080/swagger-ui.html after running the application.
Testing
The project includes unit tests and integration tests. You can run the tests using the following command:
**mvn test**

## Deployment

 You can create a Docker image and use a container orchestration platform like Kubernetes or Docker Compose to deploy the application.

## Contributing
If you would like to contribute to the project, please follow these steps:

Fork the repository
Create a new branch for your feature or bugfix
Implement your changes
Write tests to cover your changes
Submit a pull request

## License
This project is licensed under the MIT License.