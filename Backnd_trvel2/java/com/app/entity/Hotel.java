package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "hotel")
@Getter
@Setter
@NoArgsConstructor
public class Hotel{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hotelId;

	@Column(length = 50)
	private String hotelName;
	
	@Column(length = 200)
	private String hotelAddress;
	
	
	private String hotelDescription;
	
	
	
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "city_id")
//	@JsonIgnore
//	private City city;
	
//	@JsonIgnore
//	@OneToMany
//	private List<Food> food = new ArrayList<Food>();

	
//	@OneToMany(targetEntity = Inventoryhotel.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name = "hotel_id",referencedColumnName = "hotelId" )
//	private List<Inventoryhotel> inventory = new ArrayList<Inventoryhotel>();
}
