package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
public class Inventoryhotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iventoryId;
	@NonNull
	private LocalDate Date;
	@NonNull
	private Integer availableRoom;
	
	private Integer roomPrice;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;
	

}
