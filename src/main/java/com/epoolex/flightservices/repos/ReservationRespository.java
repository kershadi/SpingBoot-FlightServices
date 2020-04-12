package com.epoolex.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epoolex.flightservices.entities.Reservation;

public interface ReservationRespository extends JpaRepository<Reservation, Integer> {

}
