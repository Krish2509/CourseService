# CourseService

CourseService is a simple RESTful API built with Spring Boot and MySQL. It manages `Course` records with basic CRUD operations.

## Requirements
- JDK 17 or later
- Maven 3.x (wrapper included)
- MySQL running and accessible

## Configuration
Update `src/main/resources/application.yml` with your MySQL credentials and database URL.

## Build & Run
```bash
./mvnw spring-boot:run
```
The service will be available at `http://localhost:8080`.

## API Endpoints
| Method | Path | Description |
| ------ | ---- | ----------- |
| POST | `/course` | Create a new course |
| GET | `/course/{courseID}` | Retrieve a course by ID |
| GET | `/courses` | List all courses |
| PUT | `/course` | Update an existing course |
| DELETE | `/course/{courseID}` | Delete a course |

## Testing
```bash
./mvnw test
```

