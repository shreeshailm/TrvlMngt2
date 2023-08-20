package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.Inventoryhotel;



public interface InventoryhotelRepository extends JpaRepository<Inventoryhotel, Long> {

//	@Modifying
//	@Query(values="insert into inventory (iventory_id, date, available_room, room_price, hotel_id) VALUES ()")
//	void addInventory(Inventoryhotel inventory , Long hotelid);
}
//INSERT INTO inventory` (`iventory_id`, `date`, `available_room`, `room_price`, `hotel_id`) VALUES ('4', '2023-10-20', '29', '1111', '1');