package com.micro.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix=FileProperties.FILE_PREFIX)
public class FileProperties {
	public static final String FILE_PREFIX = "com.micro.starter.file";
	private String serviceName;
	private String port;
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