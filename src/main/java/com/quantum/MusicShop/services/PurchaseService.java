package com.quantum.MusicShop.services;

import com.quantum.MusicShop.entities.Purchase;

import java.util.List;

public interface PurchaseService {

	List<Purchase> findAll();

	Purchase save(Purchase purchase);

	Purchase findOne(Long id);

	void delete(Long id);

	Purchase update(Purchase purchase, Long id);

}
