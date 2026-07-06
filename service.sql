CREATE DATABASE servicebooking;

USE servicebooking;

CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(100),
    email VARCHAR(100),
    service VARCHAR(50),
    date VARCHAR(50),
    message TEXT
);
