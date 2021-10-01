# Health Reminder Service API

A Spring Boot REST API service that reminds users to practice healthy activities while working from home (WFH)

## About this module

This module is meant to be a reminder service that is linked to Alfred, the slack bot to notify the worker to maintain a healthy practice while WFH. Here is the full design stages to provide the service :

| Step | TODO                                                                    | Purpose + HOW TO            | Progress |
| ---- | ----------------------------------------------------------------------- | --------------------------- | -------- |
| 0    | Debugging message for users                                             | GET request to `/greeting`  | TODO     |
| 1    | Remind the worker to drink some water after certain period              | POST request to `/water`    | DONE     |
| 2    | Remind the worker to stretch after certain period                       | POST request to `/posture`  | DONE     |
| 3    | List all commands available & description of what this service is doing | GET/POST request to `/help` | DONE     |

## HOW TO (with Maven)

### Run the application

1. Run command `mvn spring-boot:run` to execute this service
2. Go to `localhost:<server.port>` (Define in `application.properties` file, port `8080` by default)

<!-- 
### Build the Docker Images

1. Run commands `mvn package && mvn dockerfile:build` to create the docker image
2. Run command `docker images` to check that the image was built 
-->

## Tools & Libraries Used

- IntelliJ IDEA
- Maven
- Docker
- Postman
- [JSON Simple Library](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1)

### Notes

<!-- #### API Credentials

- On Java class __, the API credentials are not included due to [security practice](https://developers.amadeus.com/blog/best-practices-api-key-storage).
- Create a Slack account and using your own Slack Token Credentials is **required**
- The implementation here fetches those credentials from the machine ENVIRONMENT variables with `System.getenv()`

#### API Response Examples

#### Query Validation

- Most of the special characters such as tab ('\t') ane newline ('\n') character are __unaccepted__ except _whitespace_

### Input Tests

Tests for `` :

For more tests done, look into unit test cases in class `` (located in `/test` directory) -->

### References

- [Tutorial : How to Parse JSON Data From a REST API Using a Simple JSON Library](https://dzone.com/articles/how-to-parse-json-data-from-a-rest-api-using-simpl)
