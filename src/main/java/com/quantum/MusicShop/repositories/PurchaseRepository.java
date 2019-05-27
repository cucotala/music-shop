package com.quantum.MusicShop.repositories;

import com.quantum.MusicShop.entities.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
}
