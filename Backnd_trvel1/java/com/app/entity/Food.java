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
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "food")
@Getter
@Setter
@NoArgsConstructor
public class Food{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long foodId;

	@Column(length = 50)
	private String foodName;
	
	private Integer foodPrice;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;
	


}
