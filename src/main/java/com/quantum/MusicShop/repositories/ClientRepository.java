package com.quantum.MusicShop.repositories;

import com.quantum.MusicShop.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
