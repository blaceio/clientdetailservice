package io.blace.microservices.clientdetailservice.mongo;

public class Trader {
    private String name;
    private String email;
    private String emailcc;
    private String emailbcc;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailcc() {
		return emailcc;
	}
	public void setEmailcc(String emailcc) {
		this.emailcc = emailcc;
	}
	public String getEmailbcc() {
		return emailbcc;
	}
	public void setEmailbcc(String emailbcc) {
		this.emailbcc = emailbcc;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", email=" + email + ", emailcc=" + emailcc + ", emailbcc=" + emailbcc + "]";
	}
}
