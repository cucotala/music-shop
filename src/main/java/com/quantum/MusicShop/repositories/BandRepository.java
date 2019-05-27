package com.quantum.MusicShop.repositories;

import com.quantum.MusicShop.entities.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<Band, Long> {

}
