package com.quantum.MusicShop.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Size(min = 3)
	private String name;


	@ManyToMany(mappedBy = "clientList")
	private List<Vinyl> vinylList;

	@OneToMany
	private List<Purchase> purchaseList;


	public Client(String name) {
		this.name = name;
	}

	public Client(){

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vinyl> getVinylList() {
		return vinylList;
	}

	public void setVinylList(List<Vinyl> vinylList) {
		this.vinylList = vinylList;
	}


}
