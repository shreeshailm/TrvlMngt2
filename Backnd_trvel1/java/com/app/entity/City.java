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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor

@Indexed
//@ToString(exclude = "hotel")
public class City {

	

	@Column(length = 30, nullable = false)
	private String cityName;

	@Id
	private Long cityPin;

	@Column(length = 30, nullable = false)
	private String cityState;

	@Column(length = 15, nullable = false)
	private String cityCountry;
	
	
	@ManyToMany(mappedBy = "assignCities",fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<TourPackage> tourPackages=new HashSet<TourPackage>();

//	@ManyToOne//(fetch = FetchType.EAGER)
//	//@JsonIgnore
//	@JoinColumn(name = "package_id" )
//	private TourPackage tourpackage;

//@JsonBackReference
//	@JsonIgnore
//	@OneToMany(mappedBy = "city" ,cascade = CascadeType.ALL, 
//			orphanRemoval = true)
	
	
	
	@OneToMany(fetch = FetchType.EAGER)
	//@JsonIgnore
	private Set<Hotel> assignhotel = new HashSet<Hotel>();
	

	
	
	
	




	public String getCityName() {
		return cityName;
	}






	public void setCityName(String cityName) {
		this.cityName = cityName;
	}






	public Long getCityPin() {
		return cityPin;
	}






	public void setCityPin(Long cityPin) {
		this.cityPin = cityPin;
	}






	public String getCityState() {
		return cityState;
	}






	public void setCityState(String cityState) {
		this.cityState = cityState;
	}






	public String getCityCountry() {
		return cityCountry;
	}






	public void setCityCountry(String cityCountry) {
		this.cityCountry = cityCountry;
	}






	public Set<TourPackage> getTourPackages() {
		return tourPackages;
	}






	public void setTourPackages(Set<TourPackage> tourPackages) {
		this.tourPackages = tourPackages;
	}






	public Set<Hotel> getAssignhotel() {
		return assignhotel;
	}






	public void setAssignhotel(Set<Hotel> assignhotel) {
		this.assignhotel.addAll(assignhotel);
	}
	
	
	
//	Old Code
//
//    public void setCertificateProperties(Set<CertificateProperty> certificateProperties)
//    {
//        this.certificateProperties = certificateProperties; 
//    }
//
//Solution Code
//    private Set<CertificateProperty> certificateProperties = new HashSet<>();
//
//    public void setCertificateProperties(Set<CertificateProperty> certificateProperties)
//    {
//        this.certificateProperties.addAll(certificateProperties);
//    }
//	

}
