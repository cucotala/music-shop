package com.quantum.MusicShop.controllers;

import com.quantum.MusicShop.entities.Client;
import com.quantum.MusicShop.services.ClientService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClientController {

	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/clients")
	public List<Client> findAll(){
		return clientService.findAll();
	}

	@PostMapping("/clients")
	public Client save (@RequestBody Client client){
		return clientService.save(client);
	}

	@GetMapping("/clients/{id}")
	public Client findOne(@PathVariable Long id){
		return clientService.findOne(id);
	}

	@DeleteMapping("/clients/{id}")
	public void delete (@PathVariable Long id){
		clientService.delete(id);
	}

	@PutMapping("/clients/{id}")
	public Client save (@Valid @RequestBody Client client, @PathVariable Long id){
		return clientService.update(client, id);
	}

}
