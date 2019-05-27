package com.quantum.MusicShop.services.impl;

import com.quantum.MusicShop.entities.Client;
import com.quantum.MusicShop.repositories.ClientRepository;
import com.quantum.MusicShop.services.ClientService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

	private final ClientRepository clientRepository;

	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client save(Client client){

		Client newClient = new Client();
		newClient.setName(client.getName());

		return clientRepository.save(newClient);

	}

	@Override
	public Client findOne(Long id){

		return clientRepository.findById(id).get();
	}

	@Override
	public void delete(Long id){
		clientRepository.deleteById(id);
	}

	@Override
	public Client update(Client client, Long id){

		Client newClient = clientRepository.findById(id).get();
		newClient.setName(client.getName());
		return clientRepository.save(newClient);
	}


}
