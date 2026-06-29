# Food Ordering System

Spring Boot Food Ordering System

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok

## Database Setup
Configured MySQL database for the project.

## Package Structure
- controller
- service
- repository
- entity
- dto
- config
- exception

## Initial project setup
Initial project setup

## Screenshots

See the screenshots folder

## Features Implemented

- Category Entity created
- Category DTO created
- Category Repository created
- Category Service layer created
- Category Controller created
- Exception handling added
- Database integration completed

## 📌 Category API

### GET /api/category

Returns all categories stored in the database.

## API Response Format

All API endpoints return a standard response structure to provide consistent responses across the application.

### Success Response

```json
{
  "statusCode": 200,
  "message": "Category retrieved",
  "data": {
    "id": 1,
    "name": "Burgers"
  },
  "timestamp": "2026-06-29T14:20:15"
}
```

### Error Response

```json
{
  "statusCode": 404,
  "message": "Category not found with id: 9999",
  "timestamp": "2026-06-29T14:21:05"
}
```

### Response Fields

| Field      | Description                                    |
| ---------- | ---------------------------------------------- |
| statusCode | HTTP status code returned by the API           |
| message    | A human-readable message describing the result |
| data       | The requested resource or returned data        |
| timestamp  | Date and time when the response was generated  |


