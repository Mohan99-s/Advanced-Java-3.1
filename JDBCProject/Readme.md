# JDBC Employee Management System - Linux Setup Guide

## Objective

Develop a Java JDBC application that interacts with a MySQL database and performs CRUD (Create, Read, Update, Delete) operations. This project demonstrates how to develop and execute a JDBC application on a Linux environment from scratch.

## Technologies Used

- Java
- JDBC
- MySQL
- MySQL Connector/J
- Linux (Ubuntu)
- Git & GitHub

## Project Structure

```text
JDBCProject/
├── src/
│   ├── DBConnection.java
│   ├── CreateTable.java
│   ├── InsertEmployee.java
│   ├── DisplayEmployee.java
│   ├── UpdateEmployee.java
│   ├── DeleteEmployee.java
│   └── EmployeeManagementSystem.java
│
├── lib/
│   └── mysql-connector-j-9.7.0.jar
│
├── README.md
├── PROJECT_GUIDE.md
└── .gitignore
```

## Step 1: Install Java

Verify Java installation:

java -version

Install Java if required.

## Step 2: Install MySQL

Install MySQL Server and start the service.

Login:

sudo mysql

## Step 3: Create Database

CREATE DATABASE company;

USE company;

## Step 4: Download MySQL JDBC Driver

Download MySQL Connector/J and place the JAR file inside the project's lib folder.

## Step 5: Create Database Connection

Create DBConnection.java and implement a reusable getConnection() method using DriverManager.

Example connection details:

Database URL:
jdbc:mysql://localhost:3306/company

Username:
root

Password:
root123

## Step 6: Compile the Project

javac -cp ".:lib/mysql-connector-j-9.7.0.jar" src/*.java

## Step 7: Run the Application

java -cp ".:src:lib/mysql-connector-j-9.7.0.jar" EmployeeManagementSystem

## Features Implemented
# JDBC Employee Management System - Linux Setup Guide

## Objective

Develop a Java JDBC application that interacts with a MySQL database and performs CRUD (Create, Read, Update, Delete) operations. This project demonstrates how to develop and execute a JDBC application on a Linux environment from scratch.

## Technologies Used

- Java
- JDBC
- MySQL
- MySQL Connector/J
- Linux (Ubuntu)
- Git & GitHub

## Project Structure

```text
JDBCProject/
├── src/
│   ├── DBConnection.java
│   ├── CreateTable.java
│   ├── InsertEmployee.java
│   ├── DisplayEmployee.java
│   ├── UpdateEmployee.java
│   ├── DeleteEmployee.java
│   └── EmployeeManagementSystem.java
│
├── lib/
│   └── mysql-connector-j-9.7.0.jar
│
├── README.md
├── PROJECT_GUIDE.md
└── .gitignore
```

## Step 1: Install Java

Verify Java installation:

java -version

Install Java if required.

## Step 2: Install MySQL

Install MySQL Server and start the service.

Login:

sudo mysql

## Step 3: Create Database

CREATE DATABASE company;

USE company;

## Step 4: Download MySQL JDBC Driver

Download MySQL Connector/J and place the JAR file inside the project's lib folder.

## Step 5: Create Database Connection

Create DBConnection.java and implement a reusable getConnection() method using DriverManager.

Example connection details:

Database URL:
jdbc:mysql://localhost:3306/company

Username:
root

Password:
root123

## Step 6: Compile the Project

javac -cp ".:lib/mysql-connector-j-9.7.0.jar" src/*.java

## Step 7: Run the Application

java -cp ".:src:lib/mysql-connector-j-9.7.0.jar" EmployeeManagementSystem

## Features Implemented

- Database Connectivity
- Create Employee Table
- Insert Employee Record
- Display Employee Records
- Update Employee Salary
- Delete Employee Record
- Menu Driven Console Application

## JDBC Concepts Used

- DriverManager
- Connection
- Statement
- PreparedStatement
- ResultSet
- executeUpdate()
- executeQuery()

## Learning Outcomes

After completing this project, I learned:

- How to configure Java and MySQL on Linux.
- How to connect Java with MySQL using JDBC.
- How to write reusable database connection code.
- How to perform CRUD operations.
- How to build a menu-driven Java application.
- How to compile and execute Java programs using the Linux terminal.
- How to manage the project using Git and GitHub.
- Database Connectivity
- Create Employee Table
- Insert Employee Record
- Display Employee Records
- Update Employee Salary
- Delete Employee Record
- Menu Driven Console Application

## JDBC Concepts Used

- DriverManager
- Connection
- Statement
- PreparedStatement
- ResultSet
- executeUpdate()
- executeQuery()

## Learning Outcomes

After completing this project, I learned:

- How to configure Java and MySQL on Linux.
- How to connect Java with MySQL using JDBC.
- How to write reusable database connection code.
- How to perform CRUD operations.
- How to build a menu-driven Java application.
- How to compile and execute Java programs using the Linux terminal.
- How to manage the project using Git and GitHub.
