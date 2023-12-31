package com.app.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.dto.AddTourPackage;
import com.app.entity.Hotel;
import com.app.entity.TourPackage;




public interface TourPackageService {
	
	//List<Hotel> getAllHotels();
	List<TourPackage> getAllTourPackage();

	TourPackage addTourPackage(AddTourPackage tourpackage);

	String deleteTourPackage(Long packageid);

	TourPackage getTourPackageDetails(Long id);

	TourPackage assignCityToPackage(Long packageId, Long cityId);
	
	TourPackage updateTourPackage(Long packageId, AddTourPackage tourpackage);
}
