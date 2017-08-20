package io.blace.microservices.clientdetailservice.mongo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
	
	List<Client> findAll();
	List<Client> findAll(Sort sort);
	Client findByName(String name);
	
}
