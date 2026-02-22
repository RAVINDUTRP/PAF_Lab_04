# 🚀 Spring Boot Lab 04 - REST API Practical

**Programming Applications & Frameworks (IT3030)**  
*SLIIT - 3rd Year, 2nd Semester*

---

## 📋 Overview

This is a **Spring Boot REST API** practical exercise demonstrating the fundamentals of building web services with Spring Boot. The project includes endpoints for greeting operations with dynamic parameters.

---

## ✨ Features

🎯 **Q1 - Basic Greeting Endpoint**
- Simple GET endpoint that returns a welcome message
- Endpoint: `/greet`
- Response: `"Welcome to Spring Boot!"`

🎯 **Q2 - Dynamic Greeting with Name & Message**
- GET endpoint with path variable for name and optional query parameter for custom message
- Endpoint: `/greet/{name}`
- Query Parameter: `message` (optional)
- Responses:
  - With message: `"Hello {name}! {message}"`
  - Without message: `"Hello {name}! Welcome to Spring Boot!"`

---

## 🛠 Technology Stack

| Technology | Version |
|-----------|---------|
| 🔷 **Java** | 21 |
| 🍃 **Spring Boot** | 4.0.3 |
| 📦 **Spring Web MVC** | 4.0.3 |
| 🔨 **Maven** | 3.6+ |

---

## 🚀 Getting Started

### Prerequisites
- ☕ Java 21 or higher
- 🔨 Maven 3.6 or higher
- 💻 Any IDE (VS Code, IntelliJ, Eclipse)

### Installation & Setup

1. **Clone or Navigate to Project**
   ```bash
   cd /path/to/lab
   ```

2. **Build the Project**
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```
   
   The application will start on `http://localhost:8080`

---

## 📡 API Endpoints

### 1️⃣ Basic Greeting
```
GET /greet
```

**Example Request:**
```bash
curl http://localhost:8080/greet
```

**Example Response:**
```
Welcome to Spring Boot!
```

---

### 2️⃣ Dynamic Greeting with Name
```
GET /greet/{name}?message={optional_message}
```

**Example Requests:**

Without custom message:
```bash
curl http://localhost:8080/greet/John
```
**Response:** `Hello John! Welcome to Spring Boot!`

---

With custom message:
```bash
curl "http://localhost:8080/greet/John?message=Have%20a%20great%20day!"
```
**Response:** `Hello John! Have a great day!`

---

## 📁 Project Structure

```
lab/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/lab4/lab/
│   │   │       └── LabApplication.java    # Main Application Class
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/                    # Static files (CSS, JS)
│   │       └── templates/                 # HTML templates
│   └── test/
│       └── java/
│           └── com/lab4/lab/
│               └── LabApplicationTests.java
├── pom.xml                               # Maven Configuration
├── mvnw                                  # Maven Wrapper (Unix)
├── mvnw.cmd                              # Maven Wrapper (Windows)
└── README.md                             # This File
```

---

## 🧪 Testing

Run the unit tests:
```bash
mvn test
```

---

## 🔧 Application Properties

Edit `src/main/resources/application.properties` to configure:

```properties
# Server Port
server.port=8080

# Application Name
spring.application.name=lab```

---

## 💡 Learning Outcomes

✅ Understanding Spring Boot application structure  
✅ Building REST endpoints with `@RestController`  
✅ Handling path variables with `@PathVariable`  
✅ Processing query parameters with `@RequestParam`  
✅ Running and testing Spring Boot applications  

---

## 🚀 Deployment

To run the application:
```bash
mvn spring-boot:run

---

## 📝 Notes

- All endpoints return plain text responses
- The application automatically starts an embedded Tomcat server
- No database configuration is required for this practical
- For production, consider adding proper exception handling and logging

---

## 📖 Additional Resources

- 🔗 [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- 🔗 [Spring Web MVC Guide](https://docs.spring.io/spring-boot/4.0.3/reference/web/servlet.html)
- 🔗 [RESTful Web Services with Spring](https://spring.io/guides/gs/rest-service/)
- 🔗 [Maven Documentation](https://maven.apache.org/guides/index.html)

---

## 👨‍💼 Author

**Practical Exercise** - IT3030 Programming Applications & Frameworks  
SLIIT - Faculty of Computing

---

## 📄 License

This project is part of SLIIT coursework and is provided for educational purposes.

---

**Happy Coding! 🎉**

*Last Updated: February 2026*
