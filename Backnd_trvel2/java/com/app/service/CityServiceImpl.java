package com.app.service;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.AddCity;
import com.app.entity.City;
import com.app.entity.Hotel;
import com.app.entity.TourPackage;
import com.app.repository.CityRepository;
import com.app.repository.HotelListRepository;


@Service
@Transactional
public class CityServiceImpl implements CityService {
	
	@Autowired
	 private HotelListRepository hoteldao ;
	
	@Autowired
	private CityRepository cityDao;
	
	@Autowired
	private ModelMapper mapper;



	@Override
	public City addCity(AddCity city) {
		
			
		City c= mapper.map(city, City.class);
		
		return cityDao.save(c);
	}

	@Override
	public String deleteCity(Long cityId) {
		// TODO Auto-generated method stub
		
		cityDao.deleteById(cityId);
		return "City deleted ";
	}

	@Override
	public List<City> getAllCity() {
		
		return cityDao.findAll();
	}

	@Override
	public City updateCity(Long cityId, City city) {

		
		City tobeUpdatedCity=cityDao.findById(cityId).orElseThrow();
		mapper.map(city, tobeUpdatedCity);
		tobeUpdatedCity.setCityPin(cityId);
		return mapper.map(tobeUpdatedCity, City.class);
	}

	@Override
	public City getCityById(Long id) {
		
		return cityDao.findById(id).orElse(null);
	}

	@Override
	public City assignHotelToCity(Long cityId, Long hotelId) {

		List<Hotel> hotels=null;
		City city=cityDao.findById(cityId).get();
		Hotel hotel = hoteldao.findById(hotelId).get();
		hotels=city.getAssignhotel();
		//hotels.clear();
		hotels.add(hotel);
		city.setAssignhotel(hotels);
		
		return cityDao.save(city);
		
		
	
	}

	

}
