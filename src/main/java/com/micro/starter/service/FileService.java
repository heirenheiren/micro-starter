package com.micro.starter.service;

public class FileService {
	private String serviceName;
	private String port;
	
	public void print() {
        System.out.println("serviceName="+serviceName + " port="+port);
    }
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}
