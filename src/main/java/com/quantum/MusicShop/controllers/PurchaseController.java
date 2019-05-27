package com.quantum.MusicShop.controllers;

import com.quantum.MusicShop.entities.Purchase;
import com.quantum.MusicShop.services.PurchaseService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PurchaseController {

	public final PurchaseService purchaseService;

	public PurchaseController(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}

	@GetMapping("/purchases")
	public List<Purchase>findAll(){

		return purchaseService.findAll();
	}


	@PostMapping("/purchases")
	public Purchase save(@RequestBody Purchase purchase){

		return purchaseService.save(purchase);

	}

	@GetMapping("/purchases/{id}")
	public Purchase findOne(@PathVariable Long id){

		return purchaseService.findOne(id);
	}

	@DeleteMapping("/purchases/{id}")
	public void delete(@PathVariable Long id){

		purchaseService.delete(id);
	}

	@PutMapping("/purchases/{id}")
	public Purchase save(@Valid @RequestBody Purchase purchase, @PathVariable Long id){

		return purchaseService.update(purchase, id);

	}
}
