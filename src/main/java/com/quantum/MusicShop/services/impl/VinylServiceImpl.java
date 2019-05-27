package com.quantum.MusicShop.services.impl;

import com.quantum.MusicShop.entities.Vinyl;
import com.quantum.MusicShop.exceptions.EntityNotFoundException;
import com.quantum.MusicShop.repositories.VinylRepository;
import com.quantum.MusicShop.services.VinylService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VinylServiceImpl implements VinylService {

	private final VinylRepository vinylRepository;

	public VinylServiceImpl(VinylRepository vinylRepository) {
		this.vinylRepository = vinylRepository;
	}

	@Override
	public List<Vinyl> findAll() {
		return vinylRepository.findAll();
	}

	@Override
	public Vinyl save(Vinyl vinyl) {

		Vinyl newVinyl = new Vinyl();
		newVinyl.setName(vinyl.getName());
		newVinyl.setBand(vinyl.getBand());
		newVinyl.setSize(vinyl.getSize());

		return vinylRepository.save(newVinyl);

	}

	@Override
	public Vinyl findOne(Long id) throws EntityNotFoundException {
		return vinylRepository.findById(id).get();

	}

	@Override
	public void delete(Long id) {
		vinylRepository.deleteById(id);
	}


	@Override
	public Vinyl update(Vinyl vinyl, Long id){

		Vinyl newVinyl = vinylRepository.findById(id).get();
		newVinyl.setName(vinyl.getName());
		newVinyl.setBand(vinyl.getBand());
		newVinyl.setSize(vinyl.getSize());

		return vinylRepository.save(newVinyl);
	}
}
