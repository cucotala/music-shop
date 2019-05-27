package com.quantum.MusicShop.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Vinyl {

	@Id
	@GeneratedValue
	private long id;

	@Column(unique = true)
	@NotNull
	private String name;

	@NotNull
	private double size;


	@ManyToOne
	private Band band;


	@ManyToMany
	private List<Client> clientList;

	@OneToMany
	private List<Purchase> purchaseList;

	public Vinyl(String name, Band band, double size) {
		this.name = name;
		this.band = band;
		this.size = size;


	}

	public Vinyl(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Band getBand() {
		return band;
	}

	public void setBand(Band band) {
		this.band = band;
	}

	public List<Client> getClientList() {
		return clientList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}
}
