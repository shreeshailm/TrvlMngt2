package com.app.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.dto.AddCity;
import com.app.dto.AddTourPackage;
import com.app.entity.City;
import com.app.entity.TourPackage;






public interface CityService {
	
	//List<Hotel> getAllHotels();
	List<City> getAllCity();

	//TourPackage addTourPackage(AddTourPackage tourpackage);

	City addCity(AddCity city);

	String deleteCity(Long cityId);
	
//TourPackage assignCityToPackage(Long packageId, Long cityId);
	City assignHotelToCity(Long cityId ,Long hotelId);
	City getCityById(Long id);
	City updateCity(Long cityId, City city);
}
