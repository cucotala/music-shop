package com.quantum.MusicShop.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.sql.Date;
import java.util.List;
//import java.util.Date;

@Entity
public class Purchase {

	@Id
	@GeneratedValue
	private Long id;

	//private Date purchaseDate;

	private int quantity;



	@ManyToOne
	private Vinyl vinyl;

	@ManyToOne
	private Client client;

	public Purchase(Vinyl vinyl,Client client, int quantity) {//Date purchaseDate){
		this.vinyl = vinyl;
		this.quantity = quantity;
		//this.purchaseDate = purchaseDate;

	}

	public Purchase (){

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Vinyl getVinyl() {
		return vinyl;
	}

	public void setVinyl(Vinyl vinyl) {
		this.vinyl = vinyl;
	}

	/*
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	*/


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
