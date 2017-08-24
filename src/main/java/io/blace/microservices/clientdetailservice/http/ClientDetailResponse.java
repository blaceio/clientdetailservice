package io.blace.microservices.clientdetailservice.http;

public class ClientDetailResponse {
	
	private String message;
	private boolean success;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "ClientDetailResponse [message=" + message + ", success=" + success + "]";
	}
	
}
