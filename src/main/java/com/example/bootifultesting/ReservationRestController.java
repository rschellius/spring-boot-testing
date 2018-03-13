package com.example.bootifultesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ReservationRestController {

    private final ReservationRepository repository;

    public ReservationRestController(ReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "reservations")
    public Collection<Reservation> getReservations() {
        return repository.findAll();
    }
}
