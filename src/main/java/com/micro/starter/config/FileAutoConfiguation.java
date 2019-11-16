package com.micro.starter.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.micro.starter.service.FileService;

@Configuration
@EnableConfigurationProperties(FileProperties.class)
public class FileAutoConfiguation {
	@Bean
	public FileService getFileProperties(FileProperties fileProperties) {
		FileService fileService = new FileService();
		fileService.setServiceName(fileProperties.getServiceName());
		fileService.setPort(fileProperties.getPort());
		return fileService;
	}
}
