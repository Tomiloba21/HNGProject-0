# HNGProject-0

A Simple REST API that returns a JSON object of the Programmer Credentials

## About HNG

This project was developed as part of the HNG Internship program. For more information about hiring talented Java developers like myself, please visit [HNG Java Developers](https://hng.tech/hire/java-developers).

## Features

THis REST API returns a JSON object of

## Requirements
- Java 17 (e.g., OpenJDK 17)
- Maven 3.x

## Installation

### Clone the Repository

 ```bash
  git clone https://github.com/Tomiloba21/HNGProject-0.git
  cd HNGProject-0 
   
 ```

### Building and Running
#### Running the Application
After building the project, you can run the application using the following command:

```shell
  mvn clean package
 java -jar target/HNGProject-0-0.0.1-SNAPSHOT.jar

```

The application will start on http://localhost:8080.

***request***
```bash
curl --request GET -sL \
     --url 'http://localhost:8080'\
```

***response***  

```json
{
      "email": "lobzter23@gmail.com",
      "current_datetime": "2025-01-31T23:02:39.585344442Z",
      "github_url": "https://github.com/Tomiloba21/HNGProject-0"
}
```


