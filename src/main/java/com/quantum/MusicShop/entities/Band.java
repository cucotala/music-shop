package com.quantum.MusicShop.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Band {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	@NotNull
	private String name;

	@OneToMany
	private List<Vinyl> vinylList;


	@NotNull
	@Min(1)
	private int members;

	public Band(String name, int members) {
		this.name = name;
		this.members = members;
	}

	public Band (){}

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
