package com.app.service;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Hotel;
import com.app.entity.Inventoryhotel;

import com.app.repository.HotelInventoryRepository;
import com.app.repository.HotelRepository;


@Service
@Transactional
public class HotelInventoryServiceImpl implements HotelInventoryService {

	
	
	
	
	@Autowired
	 private HotelInventoryRepository hotelInventoryDao ;
	
	@Override
	public String addInventory(LocalDate Date, Integer availableRoom, Integer hotelId) {
		
		Inventoryhotel h= new Inventoryhotel();
		h.setDate(Date);
		h.setAvailableRoom(availableRoom);
		//h.setHotelId(hotelId);
		hotelInventoryDao.save(h);
		
		return "HotelInventory Added";
	}

	@Override
	public String deleteInventory(Long id) {
		
		return "Hotel Inventory deleted";
	}

	@Override
	public Inventoryhotel addInventory(Inventoryhotel inventory ) {
		
		
		// TODO Auto-generated method stub
		return hotelInventoryDao.save(inventory);
	}

}
