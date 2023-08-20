package com.app.service;

import java.time.LocalDate;

public interface HotelInventoryService {
	String addInventory(LocalDate Date,Integer availableRoom,Integer hotelId);
	String deleteInventory(Long id);
}
