package com.epoolex.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epoolex.flightservices.entities.Passenger;

public interface PassengerRespository extends JpaRepository<Passenger, Integer> {

}


