package com.quantum.MusicShop.models;

import com.quantum.MusicShop.entities.Band;
import com.quantum.MusicShop.entities.Vinyl;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public class BandModel {

	private Long id;

	@NotNull
	private String name;

	private List<Vinyl> vinylList;


	@NotNull
	@Min(1)
	private int members;


	public static BandModel from (Band band){

		BandModel bandModel = new BandModel();
		bandModel.setId(band.getId());
		bandModel.setName(band.getName());
		bandModel.setMembers(band.getMembers());
		bandModel.setVinylList(band.getVinylList());

		return bandModel;


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

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}
}
