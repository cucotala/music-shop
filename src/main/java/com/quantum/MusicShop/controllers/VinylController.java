package com.quantum.MusicShop.controllers;

import com.quantum.MusicShop.entities.Vinyl;
import com.quantum.MusicShop.exceptions.EntityNotFoundException;
import com.quantum.MusicShop.services.VinylService;
import com.quantum.MusicShop.services.impl.VinylServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class VinylController {

	private final VinylService vinylService;

	public VinylController(VinylService vinylService) {
		this.vinylService = vinylService;
	}

	@GetMapping("/vinyls")
	public List<Vinyl> findAll() {
		return vinylService.findAll();
	}

	@PostMapping("/vinyls")
	public Vinyl save(@RequestBody Vinyl vinyl) {
		return vinylService.save(vinyl);
	}

	@GetMapping("/vinyls/{id}")
	public Vinyl findOne(@PathVariable Long id) throws EntityNotFoundException {
		return vinylService.findOne(id);

	}

	@DeleteMapping("/vinyls/{id}")
	public void delete(@PathVariable Long id) {
		vinylService.delete(id);
	}

	@PutMapping("/vinyls/{id}")
	public Vinyl save(@Valid @RequestBody Vinyl vinyl, @PathVariable Long id) {
		return vinylService.update(vinyl, id);
	}
}
