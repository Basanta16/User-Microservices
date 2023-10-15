package com.basanta.RatingService.services;

import com.basanta.RatingService.entities.Ratings;

import java.util.List;

public interface RatingsService {

    Ratings saveRatings(Ratings ratings);

    Ratings getRating(Long ratingId);

    List<Ratings> getAllRatings();

    List<Ratings> getAllRatingsByUserId(Long userId);
}
