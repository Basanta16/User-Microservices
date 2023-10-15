package com.basanta.RatingService.services.impl;

import com.basanta.RatingService.entities.Ratings;
import com.basanta.RatingService.exceptions.ResourceNotFoundException;
import com.basanta.RatingService.repository.RatingRepo;
import com.basanta.RatingService.services.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RatingsServiceImpl implements RatingsService {


    @Autowired
    private RatingRepo ratingRepo;


    @Override
    public Ratings saveRatings(Ratings ratings) {
        return ratingRepo.save(ratings);
    }

    @Override
    public Ratings getRating(Long ratingId) {
        return ratingRepo.findById(ratingId).orElseThrow(()-> new ResourceNotFoundException("Ratings with this id not found: "+ratingId));
    }

    @Override
    public List<Ratings> getAllRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Ratings> getAllRatingsByUserId(Long userId) {
        return ratingRepo.findByUserId(userId);
    }
}
