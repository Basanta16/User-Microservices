package com.basanta.userservice.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ratings {

    private Long ratingsId;
    private Long userId;
    private Long hotelId;
    private int ratings;
    private String remarks;

    private Hotel hotel;
}
