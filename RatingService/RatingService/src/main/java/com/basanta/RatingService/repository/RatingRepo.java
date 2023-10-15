package com.basanta.RatingService.repository;

import com.basanta.RatingService.entities.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RatingRepo extends JpaRepository<Ratings, Long> {



    List<Ratings> findByHotelId(Long hotelId);

    @Query(nativeQuery = true, value ="select * from tbl_ratings  where user_id =?1")
    List<Ratings> findByUserId(Long userId);
}
