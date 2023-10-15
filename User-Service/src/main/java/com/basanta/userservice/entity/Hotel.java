package com.basanta.userservice.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {

    private Long hotelId;

    private String name;

    private String location;

    private String about;
}
