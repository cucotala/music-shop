package com.quantum.MusicShop.services;

import com.quantum.MusicShop.entities.Band;
import com.quantum.MusicShop.exceptions.DuplicatedEntityException;
import com.quantum.MusicShop.models.BandModel;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface BandService {

	List<Band> findAll();

	Band save (Band band) throws DuplicatedEntityException;

	Band findOne(Long id) throws EntityNotFoundException ;

	void delete (Long id);

	Band update (Band band, Long id);

}
