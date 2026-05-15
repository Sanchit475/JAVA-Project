CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students(
    serial INT PRIMARY KEY AUTO_INCREMENT,
    course VARCHAR(100) NOT NULL,
    name VARCHAR(150) NOT NULL,
    roll VARCHAR(50) UNIQUE NOT NULL,
    semester INT NOT NULL,
    gender VARCHAR(20) NOT NULL,
    address TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
