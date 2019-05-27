package com.quantum.MusicShop.services.impl;

import com.quantum.MusicShop.entities.Band;
import com.quantum.MusicShop.exceptions.DuplicatedEntityException;
import com.quantum.MusicShop.exceptions.EntityNotFoundException;
import com.quantum.MusicShop.models.BandModel;
import com.quantum.MusicShop.repositories.BandRepository;
import com.quantum.MusicShop.services.BandService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class BandServiceImpl implements BandService {

	private final BandRepository bandRepository;

	public BandServiceImpl(BandRepository bandRepository) {
		this.bandRepository = bandRepository;
	}

	@Override
	public List<Band> findAll() {

		return bandRepository.findAll();

		/*
		return bandRepository.findAll()
							 .stream()
							 .map(BandModel::from)
							 .collect(Collectors.toList());*/
	}

	@Override
	public Band save(Band band){//throws EntityNotFoundException {

		//Optional<Band> bandOptional = bandRepository.findById(bandModel.getId());

		/*if(bandOptional.isPresent())
			throw new DuplicatedEntityException();*/

		Band newband  = new Band();
		newband.setName(band.getName());
		newband.setMembers(band.getMembers());

		return bandRepository.save(newband);



	}

	@Override
	public Band findOne(Long id) {//throws EntityNotFoundException {

		return bandRepository.findById(id).get();

		/*
		return bandRepository.findById(id)
							 .map(BandModel::from)
							 .orElseThrow(EntityNotFoundException::new);*/
	}

	@Override
	public void delete(Long id) {

		bandRepository.deleteById(id);

	}

	@Override
	public Band update(Band band, Long id) {

		Band newBand = bandRepository.findById(id).get();
		newBand.setName(band.getName());
		newBand.setMembers(band.getMembers());
		newBand.setVinylList(band.getVinylList());

		return bandRepository.save(newBand);

	}

}
