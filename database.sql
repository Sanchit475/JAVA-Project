CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    serial INT PRIMARY KEY,
    course VARCHAR(50),
    name VARCHAR(100),
    roll VARCHAR(30),
    semester INT,
    gender VARCHAR(20),
    address VARCHAR(255)
);
