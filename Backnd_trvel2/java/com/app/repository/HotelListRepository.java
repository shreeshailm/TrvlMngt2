package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.entity.Hotel;



public interface HotelListRepository extends JpaRepository<Hotel, Long> {

}
