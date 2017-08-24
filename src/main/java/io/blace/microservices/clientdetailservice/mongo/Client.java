package io.blace.microservices.clientdetailservice.mongo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Client {
    
	@Id
	@Indexed(unique = true)
	private String name;
	
	private List<Trader> traders;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Trader> getTraders() {
		return traders;
	}
	public void setTraders(List<Trader> traders) {
		this.traders = traders;
	}
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", traders=" + traders + "]";
	}
}
