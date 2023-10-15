package com.basanta.RatingService.controllers;


import com.basanta.RatingService.entities.Ratings;
import com.basanta.RatingService.services.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsController {


    private RatingsService ratingsService;

    @Autowired
    public RatingsController(RatingsService ratingsService) {

        this.ratingsService = ratingsService;
    }

    @PostMapping
    public ResponseEntity<Ratings> createUser(@Validated @RequestBody Ratings ratings, BindingResult bindingResult) {


        Ratings saveRating = ratingsService.saveRatings(ratings);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveRating);
    }

    @GetMapping
    public ResponseEntity<List<Ratings>> getAllUser() {
        List<Ratings> getAllRatings = ratingsService.getAllRatings();
        return ResponseEntity.ok(getAllRatings);
    }


    @GetMapping("/{ratingsId}")
    public ResponseEntity<Ratings> getRatings(@PathVariable Long ratingsId) {
        Ratings getRatings = ratingsService.getRating(ratingsId);
        return ResponseEntity.ok(getRatings);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Ratings>> getRatingsByUserID(@PathVariable Long userId) {
        List<Ratings> getRatings = ratingsService.getAllRatingsByUserId(userId);
        return ResponseEntity.ok(getRatings);
    }}
