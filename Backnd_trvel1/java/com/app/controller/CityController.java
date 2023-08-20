package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AddCity;
import com.app.entity.City;
import com.app.entity.Hotel;
import com.app.entity.TourPackage;
import com.app.service.CityService;
import com.app.service.HotelService;
import com.app.service.HotelServiceImpl;
import com.app.service.TourPackageService;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "*")
public class CityController {

	@Autowired
	private CityService cityService;

	@GetMapping
	public List<City> getAllCity() {
		return cityService.getAllCity();
	}

	@PostMapping("/addCity")
	public ResponseEntity<City> saveCity(@RequestBody AddCity city) {
		cityService.addCity(city);
		return new ResponseEntity<City>(HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public String deleteCity(@PathVariable Long id) {
		return cityService.deleteCity(id);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCityById(@PathVariable Long id){
		
		City c= cityService.getCityById(id);
		if(c==null)
			return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return ResponseEntity.ok(c);
	}

	@PutMapping("/updateCity/{id}")
	public ResponseEntity<City> updateCity(@PathVariable Long id, @RequestBody City city) {
		cityService.updateCity(id, city);
		return new ResponseEntity<City>(HttpStatus.CREATED);
	}


//	@PostMapping("/{packageId}/city/{cityId}")
//	public TourPackage assignCityToPackage(@PathVariable Long packageId ,
//			@PathVariable Long cityId ) {
//		
//		
//		return tourPackageService.assignCityToPackage(packageId,cityId);
//				
//				
//	}		
	
	
	@PostMapping("/{cityId}/hotel/{hotelId}")
	public City assignHotel(@PathVariable Long cityId , @PathVariable  Long hotelId) {
		return cityService.assignHotelToCity(cityId, hotelId);
	}

}
