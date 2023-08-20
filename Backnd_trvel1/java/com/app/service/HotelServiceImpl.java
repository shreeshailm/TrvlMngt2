package com.app.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.app.entity.Hotel;
import com.app.repository.HotelListRepository;



@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	 private HotelListRepository hoteldao ;
	
	
	@Override
	public List<Hotel> getAllHotels() {
		return hoteldao.findAll();
	}

	
	@Override
	public Hotel getHotelDetails(Long hotelId) {
		// TODO Auto-generated method stub
		return hoteldao.findById(hotelId).orElseThrow();
	}
	
	//have to write thorw exception like below
//		return empDao.findById(empId).orElseThrow(() -> new ResourceNotFoundException("Emp id invalid !!!!!"));


//	@Override
//	public String addHotel(MultipartFile file, String hotelName, String hotelAddress, Integer hotelCityId,
//			Double hotelPrice, boolean hotelActive) {
//		
//		Hotel h=new Hotel();
//		
//		h.setHotelName(hotelName);
//		h.setHotelAddress(hotelAddress);
//		h.setHotelCityId(hotelCityId);
//		h.setHotelPrice(hotelPrice);
//		
//		h.setHotelActive(hotelActive);
//		
//		hoteldao.save(h);
//		
//		return "Hotel added succesfully";
//	}

	@Override
	public String deleteHotel(Long id) {
		
		return "Hotel deleted sucessfully";
	}


	@Override
	public Hotel addHotel(Hotel hotel) {

		return hoteldao.save(hotel);
	}



	

	
}
