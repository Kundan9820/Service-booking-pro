package com.servicebooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.servicebooking.model.Booking;
import com.servicebooking.service.BookingService;
import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500") // safer than "*"
@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService service;

    // POST: create booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return service.save(booking);
    }

    // GET: get all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return service.findAll();
    }
}
