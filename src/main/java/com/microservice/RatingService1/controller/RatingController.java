package com.microservice.RatingService1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.RatingService1.entity.Rating;
import com.microservice.RatingService1.payloads.RatingDto;
import com.microservice.RatingService1.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	// create rating
//API-http://localhost:1919/ratings/create
	@PostMapping(path = "/{create}")
	public ResponseEntity<RatingDto> create(@RequestBody RatingDto ratingDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(ratingDto));
	}

	// API-http://localhost:1919/ratings/getRating
	@GetMapping(path = "getRating")
	public ResponseEntity<List<RatingDto>> getRatings() {
		return ResponseEntity.ok(ratingService.getRatings());
	}
	// API-http://localhost:1919/ratings/user/{userId}
	@GetMapping(path="user/{userId}")
	public ResponseEntity<List<RatingDto>> getRatingByUserId(@PathVariable Integer userId) {
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));

	}
	//get all of hotels
	// API-http://localhost:1919/ratings/hotels/{hotelId}
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<RatingDto>> getRatingsByHotelId(@PathVariable Integer hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }
	

}
