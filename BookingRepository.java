package com.servicebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.servicebooking.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
