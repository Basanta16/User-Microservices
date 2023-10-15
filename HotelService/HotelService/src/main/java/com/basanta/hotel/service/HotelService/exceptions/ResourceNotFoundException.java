package com.basanta.hotel.service.HotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource Not Found!!!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
