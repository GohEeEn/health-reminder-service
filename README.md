# Health Reminder Service API

A REST API microservice written in Spring Boot, that reminds users to practice healthy activities while working from home (WFH)

__THIS IS PART OF WORKDAY TECH ORBIT PROGRAMME HACKATHON 2021__

## About this module

This module is meant to be a reminder service that is linked to Alfred, the slack bot to notify the worker to maintain a healthy practice while WFH. Here is the full design stages to provide the service :

| Step | TODO                                                                    | Purpose + HOW TO                | Progress |
| ---- | ----------------------------------------------------------------------- | ------------------------------- | -------- |
| 0    | Debugging message for users                                             | GET request to `/greeting`      | DONE     |
| 1    | Remind the worker to drink some water after certain period              | POST request to `/water`        | DONE     |
| 2    | Remind the worker to stretch after certain period                       | POST request to `/posture`      | DONE     |
| 3    | List all commands available & description of what this service is doing | GET/POST request to `/help`     | DONE     |
| 4    | Return error message when invalid command is given                      | Any other not-mentioned command | DONE     |

### Tools & Libraries Used

- IntelliJ IDEA (IDE)
- Maven
- Spring Boot
- [JSON Simple Library](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1)

### Slack Bot Request Parameters (JSON format required)

| Order. | Name     | Use                                |
| ------ | -------- | ---------------------------------- |
| 1.     | user     | Displayed Slack account name       |
| 2.     | username | Actual full name registered        |
| 3.     | userid   | Unique userid of the Slack account |
| 4.     | arg      | Any argument (default **0**)       |

Example

```JSON
{
    "user":"xyz",
    "username":"Vincent_Goh",
    "userid":"UIC1234",
    "arg":""
}
```

### Service Response Parameter (in JSON format)

| Order. | Name | Use                          |
| ------ | ---- | ---------------------------- |
| 1.     | user | Displayed Slack account name |

Example

```JSON
{
    "response":"Hey Vincent_Goh, working hard is great while also don't forget to stretch after awhile!"
}
```

### Tested Payload

(Request)

`curl -X POST -H 'Content-Type: application/json' -d '{"user":"xyz", "username": "Oisin Aylward", "args": ""}' 127.0.0.1:8080/posture`

to

`{"response":"Hey Oisin Aylward, working hard is great while also don't forget to stretch after awhile!"}`

(Response)

## HOW TO (with Maven)

### Run this service application

1. Run command `mvn spring-boot:run` to execute this service
2. Go to `localhost:<server.port>` (Define in `application.properties` file, port `8080` by default)

<!-- 
### Build the Docker Images

1. Run commands `mvn package && mvn dockerfile:build` to create the docker image
2. Run command `docker images` to check that the image was built 
-->

### References

- [Tutorial : How to Parse JSON Data From a REST API Using a Simple JSON Library](https://dzone.com/articles/how-to-parse-json-data-from-a-rest-api-using-simpl)

## TODO in future (if any)

1. Add timing mechanism to notify the service-registered users after certain period
2. Add security filter for incoming request payload, in order prevent injection attack
3. Dockerize this service (OPTIONAL)
