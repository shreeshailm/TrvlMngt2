package com.app.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import org.springframework.stereotype.Indexed;
@Entity
@Table(name = "tour_package")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Indexed
//@ToString(exclude = "hotel")

public class TourPackage extends BaseEntity {

	

	@Column(length = 30, nullable = false)
	private String packageName;

	private String image;

	private String packageDescription;

	private Integer noOfDays;

	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
	@JoinTable(name ="tourpackage_city",
	joinColumns = @JoinColumn(name="tourPackage_id"),
	inverseJoinColumns =@JoinColumn(name="city_pin")
	)
	
	private Set<City> assignCities= new HashSet<City>();
	
//@JsonBackReference
	
//	@OneToMany(mappedBy = "tourpackage", 
//			cascade = CascadeType.ALL, 
//			orphanRemoval = true /* , fetch = FetchType.EAGER */ )
//	@JsonIgnore
//	private List<City> city = new ArrayList<City>();
//	
//	public void addCity(City c) {
//		city.add(c);// like dept --> emp
//		c.setTourpackage(this);// like emp --> dept
//	}
//	public void removeCity(City c) {
//		city.remove(c);
//		c.setTourpackage(null);
//	}

}
