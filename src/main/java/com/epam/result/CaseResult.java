package com.epam.result;

public class CaseResult {
	
	private String name;
	private Status status;
	
	public CaseResult(String name, Status status) {
		super();
		this.name = name;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CaseResult [name=" + name + ", status=" + status + "]";
	}

}