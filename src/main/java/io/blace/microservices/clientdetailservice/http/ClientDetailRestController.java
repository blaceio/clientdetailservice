package io.blace.microservices.clientdetailservice.http;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.blace.microservices.clientdetailservice.controller.ClientDetailController;
import io.blace.microservices.clientdetailservice.mongo.Client;
import io.blace.microservices.clientdetailservice.mongo.ClientRepository;

@RestController
public class ClientDetailRestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ClientDetailController clientdetailcontroller;
	

    @CrossOrigin
    @PostMapping("/saveclientdetail")
    public ResponseEntity<ClientDetailResponse> saveClientDetail(@RequestBody Client clientdetail) {
    	logger.info("saveclientdetail request received: " + clientdetail);
    	return new ResponseEntity<ClientDetailResponse>(clientdetailcontroller.insert(clientdetail), new HttpHeaders(), HttpStatus.OK);
    }
    
    @CrossOrigin
    @GetMapping("/getclients")
    public ResponseEntity<List<Client>> getAllClients() {
    	logger.info("getclients request received.");
        return new ResponseEntity<List<Client>>(clientdetailcontroller.findall(), new HttpHeaders(), HttpStatus.OK);
    }
    
    @CrossOrigin
    @GetMapping("/getclient/{clientname}")
    public ResponseEntity<Client> getClient(@PathVariable String clientname) {
    	logger.info("getclient request received: " + clientname);
        return new ResponseEntity<Client>(clientdetailcontroller.findbyname(clientname), new HttpHeaders(), HttpStatus.OK);
    }
    
}

