package com.quantum.MusicShop.services.impl;

import com.quantum.MusicShop.entities.Purchase;
import com.quantum.MusicShop.repositories.PurchaseRepository;
import com.quantum.MusicShop.services.PurchaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseSevicesImpl implements PurchaseService {

	private final PurchaseRepository purchaseRepository;

	public PurchaseSevicesImpl(PurchaseRepository purchaseRepository) {
		this.purchaseRepository = purchaseRepository;
	}


	@Override
	public List<Purchase> findAll(){

		return purchaseRepository.findAll();

	}

	@Override
	public Purchase save(Purchase purchase) {

		Purchase newPurchase =  new Purchase();
		newPurchase.setVinyl(purchase.getVinyl());
		newPurchase.setClient(purchase.getClient());

	return purchaseRepository.save(newPurchase);

	}

	@Override
	public Purchase findOne(Long id){

		return purchaseRepository.findById(id).get();
	}

	@Override
	public void delete(Long id){

		purchaseRepository.deleteById(id);

	}

	@Override
	public Purchase update(Purchase purchase, Long id){

		Purchase newPurchase = purchaseRepository.findById(id).get();
		newPurchase.setVinyl(purchase.getVinyl());
		newPurchase.setClient(purchase.getClient());
		newPurchase.setQuantity(purchase.getQuantity());

		return purchaseRepository.save(newPurchase);

	}



}
