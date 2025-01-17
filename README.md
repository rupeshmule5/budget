# Budget Service

## Overview
The Budget Service provides APIs to manage budgets. Users can create, retrieve, and delete budget entries.

## Requirements
- Java 17+
- Maven 3+
- H2 Database

## Running the Service

1. Clone the repository:
   git clone <repository-url>
   cd budget-service

2. Build the application:
   mvn clean install

3. Run the application:
   mvn spring-boot:run

4. Access the H2 Console:
   - URL: [http://localhost:8081/h2-console](http://localhost:8081/h2-console)
   - JDBC URL: `jdbc:h2:mem:budgetdb`
   - Username: `sa`
   - Password: `password`

5. Access Swagger UI:
   - URL: [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)

## API Endpoints

### Create Budget
- **URL**: `/api/v1/budgets`
- **Method**: POST
- **Body**:
  ```json
  {
    "category": "Groceries",
    "amount": 500.0
  }
  ```

### Get All Budgets
- **URL**: `/api/v1/budgets`
- **Method**: GET

### Get Budget by ID
- **URL**: `/api/v1/budgets/{id}`
- **Method**: GET

### Delete Budget
- **URL**: `/api/v1/budgets/{id}`
- **Method**: DELETE
