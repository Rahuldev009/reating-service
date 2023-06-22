package com.microservice.RatingService1.service;

import java.util.List;


import com.microservice.RatingService1.payloads.RatingDto;

public interface RatingService {
	 //create
    RatingDto create(RatingDto ratingDto);


	//get all ratings
    List<RatingDto> getRatings();

    //get all by UserId
    List<RatingDto> getRatingByUserId(Integer userId);

    //get all by hotel
    List<RatingDto> getRatingByHotelId(Integer hotelId);

}
