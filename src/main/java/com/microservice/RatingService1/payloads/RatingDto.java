
package com.microservice.RatingService1.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RatingDto {
	private String ratingId;

	@NotEmpty
	private Integer userId;

	@NotEmpty
	private Integer hotelId;

	@NotEmpty // @Size(min = 4, message = "rating must be min of 4 characters !!")
	private Integer rating;

	@NotEmpty

	@Size(min = 4, message = "feedback must be min of 4 characters !!")
	private String feedback;

}
