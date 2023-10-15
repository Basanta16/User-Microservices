package com.basanta.RatingService.entities;


import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "tbl_ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ratings {

    @Id
    @SequenceGenerator(name = "ratings_seq", sequenceName = "ratings_seq", allocationSize = 1)
    @GeneratedValue(generator = "ratings_seq", strategy = GenerationType.SEQUENCE)
    private Long ratingsId;
    private Long userId;
    private Long hotelId;
    private int ratings;
    private String remarks;
}
