# ATelier3-Devops

Simple Emprunt (Loan) Application for testing Docker deployment.

## Features

- Display a list of book loans
- Simple database setup with sample data

## Prerequisites

- Docker and Docker Compose
- Maven (for building)

## Build and Run with Docker

1. Build the application WAR file:
   ```
   mvn clean package
   ```

2. Build and start the Docker containers:
   ```
   docker-compose up -d
   ```

3. Access the application at:
   ```
   http://localhost:8080/
   ```

## Database Schema

The application uses a MySQL database with the following schema:
- `emprunt` - Stores book loans with book title, user name, loan date, and return date

## Docker Components

- Web Application (Tomcat)
- MySQL Database

## Stopping the Application

```
docker-compose down
```