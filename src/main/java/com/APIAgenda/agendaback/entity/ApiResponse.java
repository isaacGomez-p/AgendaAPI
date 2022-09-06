package com.APIAgenda.agendaback.entity;

public class ApiResponse {


	Long status;
	String message;
	String result;
	
	public ApiResponse() {
		
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
