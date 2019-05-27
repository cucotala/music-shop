package com.quantum.MusicShop.services;

import com.quantum.MusicShop.entities.Client;

import java.util.List;

public interface ClientService {

	List<Client> findAll();

	Client save (Client client);

	Client findOne(Long id);

	void delete(Long id);

	Client update(Client client, Long id);


}
