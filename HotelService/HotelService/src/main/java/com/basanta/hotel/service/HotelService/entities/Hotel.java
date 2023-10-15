package com.basanta.hotel.service.HotelService.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_hotel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    @Id
    @SequenceGenerator(name = "hotel_seq", sequenceName = "hotel_seq", allocationSize = 1)
    @GeneratedValue(generator = "hotel_seq", strategy = GenerationType.SEQUENCE)
    private Long hotelId;

    private String name;

    private String location;

    private String about;

}
