# MoneyTransferAPI
Simple Spring boot application which provide RESTful API for money transfer

### Prerequisite
- Maven
- JDK 1.8+
### Project Structure
```bash
MoneyTransferAPI
├── src
│   ├── main
│   │   ├── java\com\example\demo
│   │   └── resources
│   └── test
│       ├── java\com\example\demo
│       └── resources
├── LICENSE
├── .gitignore
├── pom.xml
└── README.md
```
### Packaging
```
mvn package
```
### Test
```
mvn test
```
### Running
```
java -jar demo-0.0.1-SNAPSHOT.jar
```
### Data
Initial data (src\main\resources\data.sql) will be loaded in the H2 database when application start.
> INSERT INTO ACCOUNTS (ACCOUNTID, BALANCE) VALUES
> (1, 100),
> (2, 100);
## Feature
This application is for demo only. It provides APIs for following 2 features
- Retrieve Account Balance
- Create Transaction
### Basic API Information
| Method | Path | Usage |
| --- | --- | --- |
| GET | /v1/accounts/{id}/balances | retrieve account balance |
| POST | /v1/transaction | create transaction |
### Swagger-UI
API Specification is provided in the [swagger-ui page](http://localhost:8080/swagger-ui.html) after spring boot application start.
```
http://localhost:8080/swagger-ui.html
```
### Error Code
| Code | Description |
| --- | --- |
| ERR_SYS_001 | used when internal server error happens |
| ERR_SYS_002 | used when gateway timeout happens (e.g. calling external services) |
| ERR_CLIENT_001 | used when error due to client's input or business logic |
| ERR_CLIENT_002 | used when error related to account logic |
### Library used
| Library | Usage |
| --- | --- |
| spring boot | for spring boot application |
| spring data jpa | for ORM and DB operation purpose |
| H2 | lightweight database for demo purpose |
| springfox swagger | generate swagger API specification from code |
| springfox swagger ui | generate swagger ui page for specification |
| httpClient | configurate http request |
