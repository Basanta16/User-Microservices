package com.basanta.hotel.service.HotelService.controllers;


import com.basanta.hotel.service.HotelService.entities.Hotel;
import com.basanta.hotel.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;


    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping
    public ResponseEntity<Hotel> createUser(@Validated @RequestBody Hotel hotel, BindingResult bindingResult) {


        Hotel saveHotel = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveHotel);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllUser() {
        List<Hotel> getAllHotel = hotelService.getAllHotel();
        return ResponseEntity.ok(getAllHotel);
    }


    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getUser(@PathVariable Long hotelId) {
        Hotel getHotel = hotelService.getHotel(hotelId);
        return ResponseEntity.ok(getHotel);
    }
}
