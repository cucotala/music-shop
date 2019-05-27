package com.quantum.MusicShop.exceptions;

public class DuplicatedEntityException extends Exception {

	public DuplicatedEntityException(){
		super ("La entidad ya existe");
	}
}
