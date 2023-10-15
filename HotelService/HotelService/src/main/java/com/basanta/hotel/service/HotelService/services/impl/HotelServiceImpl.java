package com.basanta.hotel.service.HotelService.services.impl;

import com.basanta.hotel.service.HotelService.entities.Hotel;
import com.basanta.hotel.service.HotelService.exceptions.ResourceNotFoundException;
import com.basanta.hotel.service.HotelService.repository.HotelRepo;
import com.basanta.hotel.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HotelServiceImpl implements HotelService {


    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel getHotel(Long hotelId) {
        return hotelRepo.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel with this id not found!!!"+ hotelId));
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }
}
