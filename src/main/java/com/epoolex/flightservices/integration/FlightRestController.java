package com.epoolex.flightservices.integration;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epoolex.flightservices.entities.Flight;
import com.epoolex.flightservices.repos.FlightRespository;

@RestController
@CrossOrigin
public class FlightRestController {

	@Autowired
	FlightRespository flightRepository;
	
	@RequestMapping("/flights")
	public List<Flight> findFlights(@RequestParam("from") String from,@RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate) {
		return flightRepository.findFlights(from, to, departureDate);
	}
	
	@RequestMapping(value = "/flights/{id}", method = RequestMethod.GET)
	public Flight findFlight(@PathVariable("id") int flightId) {
		return flightRepository.findById(flightId).get();
	}
}
