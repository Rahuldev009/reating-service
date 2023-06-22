package com.microservice.RatingService1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="rating")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ratingId;
	
	private Integer userId;
	private Integer hotelId;
	private Integer rating;
	private String feedback;
}