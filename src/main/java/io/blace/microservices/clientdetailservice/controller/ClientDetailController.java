package io.blace.microservices.clientdetailservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import io.blace.microservices.clientdetailservice.http.ClientDetailResponse;
import io.blace.microservices.clientdetailservice.mongo.Client;
import io.blace.microservices.clientdetailservice.mongo.ClientRepository;

@Controller
public class ClientDetailController {
	
    @Autowired
    private ClientRepository clientRepository;
    
    public ClientDetailResponse insert(Client clientdetail) {
    	
    	ClientDetailResponse response = new ClientDetailResponse();
    	
    	try	{ 
    		clientRepository.insert(clientdetail);
    		response.setMessage(clientdetail.getName() + " inserted");
    		response.setSuccess(true);
    	} catch ( Exception ex ) {
    		response.setMessage(clientdetail.getName() + " already exists");
    		response.setSuccess(false);
    	}
    	
    	return response;
    	
    }
    
    public List<Client> findall() {
    	return clientRepository.findAll(new Sort(Sort.Direction.ASC, "name"));
    }
    
    public Client findbyname(String clientname) {
    	return clientRepository.findByName(clientname);
    }
}
