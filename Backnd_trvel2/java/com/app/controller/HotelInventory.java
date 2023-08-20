package com.app.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.app.entity.Hotel;
import com.app.entity.Inventoryhotel;
import com.app.entity.TourPackage;
import com.app.service.HotelInventoryService;
import com.app.service.HotelService;

@RestController
@RequestMapping("/hotelInventory")
@CrossOrigin(origins = "*")
public class HotelInventory {

	@Autowired
	private HotelInventoryService hotelInventoryService;


//	@PostMapping
//	public String addHotelInventory(@RequestBody LocalDate date, @RequestParam("hotelId") Integer hotelId,
//			@RequestParam("availrooms") Integer availrooms) {
//
//		return hotelInventoryService.addInventory(date, availrooms, hotelId);
//	}
	
	@PostMapping()
	public ResponseEntity<Inventoryhotel> addHotel(@RequestBody Inventoryhotel inventory){
	hotelInventoryService.addInventory(inventory);
		return new ResponseEntity<Inventoryhotel>(HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return hotelInventoryService.deleteInventory(id);

		
		
	}
}
