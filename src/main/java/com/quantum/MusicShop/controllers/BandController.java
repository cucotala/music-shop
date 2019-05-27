package com.quantum.MusicShop.controllers;

import com.quantum.MusicShop.entities.Band;
import com.quantum.MusicShop.exceptions.DuplicatedEntityException;
import com.quantum.MusicShop.models.BandModel;
import com.quantum.MusicShop.services.BandService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@RestController
public class BandController {

	private final BandService bandService;

	public BandController(BandService bandService) {
		this.bandService = bandService;
	}

	@GetMapping("/bands")
	public List<Band> findAll() {
		return bandService.findAll();
	}

	@PostMapping("/bands")
	public Band save(@RequestBody Band band) throws DuplicatedEntityException {
		return bandService.save(band);

	}

	@GetMapping("/bands/{id}")
	public Band findOne(@PathVariable Long id) throws EntityNotFoundException {
		return bandService.findOne(id);
	}

	@DeleteMapping("/bands/{id}")
	public void delete(@PathVariable Long id) {
		bandService.delete(id);

	}

	@PutMapping("/bands/{id}")
	public Band save(@Valid @RequestBody Band band, @PathVariable Long id) {
		return bandService.update(band, id);

	}

}
