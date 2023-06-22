package com.microservice.RatingService1.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservice.RatingService1.entity.Rating;
import com.microservice.RatingService1.payloads.RatingDto;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

	// custom finder methods
	List<Rating> findByUserId(Integer userId);

	List<Rating> findByHotelId(Integer hotelId);
}
