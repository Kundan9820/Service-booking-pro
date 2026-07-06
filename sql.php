CREATE DATABASE IF NOT EXISTS servicebooking;
USE servicebooking;

CREATE TABLE bookings (
  id INT AUTO_INCREMENT PRIMARY KEY,
  booking_id VARCHAR(50) NOT NULL UNIQUE,
  fullname VARCHAR(150) NOT NULL,
  email VARCHAR(150) NOT NULL,
  service VARCHAR(100) NOT NULL,
  date VARCHAR(50),
  location VARCHAR(255),
  message TEXT,
  payment_method VARCHAR(50),
  amount_paid DECIMAL(10,2) DEFAULT 0,
  discount_applied TINYINT(1) DEFAULT 0,
  offer_code VARCHAR(50),
  status VARCHAR(30) DEFAULT 'Pending',
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
