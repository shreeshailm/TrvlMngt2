package com.app.service;

import java.time.LocalDate;

import com.app.entity.Inventoryhotel;

public interface HotelInventoryService {
	String addInventory(LocalDate Date,Integer availableRoom,Integer hotelId);
	
	Inventoryhotel addInventory(Inventoryhotel inventory );
	
	String deleteInventory(Long id);
	
	
}
