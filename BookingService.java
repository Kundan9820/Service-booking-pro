package com.servicebooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.servicebooking.model.Booking;
import com.servicebooking.repository.BookingRepository;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository repository;

    // Save a new booking
    public Booking save(Booking booking) {
        return repository.save(booking);
    }

    // Get all bookings
    public List<Booking> findAll() {
        return repository.findAll();
    }
}
