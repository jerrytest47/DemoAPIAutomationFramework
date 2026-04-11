# API Automation Framework (Rest Assured + TestNG)

This project is a **REST API Automation Framework** built using **Java**, **Rest Assured**, **TestNG**, and **Maven**. It follows a modular and scalable design using service layers, factories, data providers, and models to ensure maintainability and reusability.

---

## 🚀 Features

- REST API testing using Rest Assured
- TestNG-based execution with suite support (`suite.xml`)
- Data-driven testing using DataProviders
- Request/Response models (POJO-based)
- Factory pattern for request payload creation
- Service layer abstraction for API calls
- Custom logging with filters
- Test listeners for reporting and execution tracking
- Maven-based build and dependency management
- CI integration with GitHub Actions

---

## 🧰 Tech Stack

- Java
- Rest Assured
- TestNG
- Maven
- Log4j2

---

## 📁 Project Structure

```bash
.
│   pom.xml
│   suite.xml
│
├── .github/workflows
│   └── maven.yml                # CI pipeline (GitHub Actions)
│
├── logs
│   └── test.log                # Execution logs
│
├── src
│   ├── main
│   │   ├── java                # (Reserved for main code if needed)
│   │   └── resources
│   │
│   └── test
│       ├── java/com/api
│       │
│       │   ├── base
│       │   │   └── BaseService.java
│       │   │
│       │   ├── dataproviders   # Test data providers
│       │   │   ├── AuthDataProvider.java
│       │   │   ├── BankAccountDataProvider.java
│       │   │   ├── CreateUserPassDataProvider.java
│       │   │   └── ...
│       │   │
│       │   ├── factory         # Request builders / payload factories
│       │   │   ├── CreateUserFactory.java
│       │   │   ├── LoginRequestFactory.java
│       │   │   └── ...
│       │   │
│       │   ├── filters         # Custom logging filters
│       │   │   └── LoggingFilter.java
│       │   │
│       │   ├── listeners       # TestNG listeners
│       │   │   └── TestListener.java
│       │   │
│       │   ├── models
│       │   │   ├── request     # Request POJOs
│       │   │   └── response    # Response POJOs
│       │   │
│       │   ├── services        # API service layer
│       │   │   ├── AuthService.java
│       │   │   ├── BankAccountService.java
│       │   │   └── UserProfileManagementService.java
│       │   │
│       │   └── tests           # Test classes
│       │       ├── LoginAPITest.java
│       │       ├── CreateBankAccountTest.java
│       │       ├── UpdateProfileTest.java
│       │       └── ...
│       │
│       └── resources
│           └── log4j2.xml      # Logging configuration
│
└── target                     # Build output (generated)