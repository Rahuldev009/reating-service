package com.microservice.RatingService1.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.RatingService1.entity.Rating;
import com.microservice.RatingService1.payloads.RatingDto;
import com.microservice.RatingService1.repository.RatingRepository;
import com.microservice.RatingService1.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public RatingDto create(RatingDto ratingDto) {
		Rating rate = modelMapper.map(ratingDto, Rating.class);
		Rating savedData = repository.save(rate);
		return modelMapper.map(savedData, RatingDto.class);
	}

	@Override
	public List<RatingDto> getRatings() {

		List<Rating> rate = repository.findAll();
		List<RatingDto> allRate = rate.stream().map((m) -> modelMapper.map(m, RatingDto.class))
				.collect(Collectors.toList());
		return allRate;
	}

	@Override
	public List<RatingDto> getRatingByUserId(Integer userId) {
		List<Rating> users = repository.findByUserId(userId);
		List<RatingDto> allUsers = users.stream().map((m) -> modelMapper.map(m, RatingDto.class))
				.collect(Collectors.toList());
		return allUsers;
	}

	@Override
	public List<RatingDto> getRatingByHotelId(Integer hotelId) {
		List<Rating> hotel = repository.findByHotelId(hotelId);
		List<RatingDto> allHotels = hotel.stream().map((m) -> modelMapper.map(m, RatingDto.class))
				.collect(Collectors.toList());
		return allHotels;
	}
}
