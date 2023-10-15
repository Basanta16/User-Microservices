package com.basanta.hotel.service.HotelService.services;

import com.basanta.hotel.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    Hotel getHotel(Long hotelId);

    List<Hotel> getAllHotel();
}
