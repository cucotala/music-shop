package com.quantum.MusicShop.repositories;

import com.quantum.MusicShop.entities.Vinyl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinylRepository extends JpaRepository<Vinyl, Long> {
}
