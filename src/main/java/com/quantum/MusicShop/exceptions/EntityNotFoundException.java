package com.quantum.MusicShop.exceptions;

public class EntityNotFoundException extends Exception {

	public EntityNotFoundException() {
		super("La entidad no existe");
	}
}
