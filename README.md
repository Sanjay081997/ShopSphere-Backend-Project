# ShopSphere Backend Project

This project is a microservice-based backend for ShopSphere e-commerce platform.

## Structure

- `common` - shared modules like config, constants, utils
- `order-service` - handles order management
- `payment-service` - payment processing
- `product-service` - product catalog management
- `user-service` - user management and authentication

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- PostgreSQL or any supported database
- Docker (optional for running containers)

### Build & Run

From the root folder:

```bash
mvn clean install
```

Run each service individually (example for user-service):

```bash
cd user-service
mvn spring-boot:run
```

## API Endpoints (Example: User Service)

- `GET /api/users` - List all users

## Further Development

- Add security (JWT/OAuth)
- Add inter-service communication (REST/RabbitMQ)
- Add database migrations (Flyway/Liquibase)
- Add tests (JUnit, Mockito)
