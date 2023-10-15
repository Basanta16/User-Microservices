package com.basanta.hotel.service.HotelService.repository;

import com.basanta.hotel.service.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel, Long> {
}
