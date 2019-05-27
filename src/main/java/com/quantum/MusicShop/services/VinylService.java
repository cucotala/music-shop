package com.quantum.MusicShop.services;

import com.quantum.MusicShop.entities.Vinyl;
import com.quantum.MusicShop.exceptions.EntityNotFoundException;

import java.util.List;

public interface VinylService {

	List<Vinyl> findAll();

	Vinyl save(Vinyl vinyl);

	Vinyl findOne(Long id) throws EntityNotFoundException;

	void delete (Long id);

	Vinyl update (Vinyl vinyl, Long id);

}
