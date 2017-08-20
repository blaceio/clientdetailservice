package io.blace.microservices.clientdetailservice.mongo;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Client {
    
	@Id
    public String id;
    
	private String name;
	private List<Trader> traders;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
		return "Client [id=" + id + ", name=" + name + ", traders=" + traders + "]";
	}
}
