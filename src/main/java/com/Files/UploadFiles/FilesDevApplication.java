package com.Files.UploadFiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

import com.Files.UploadFiles.domain.User;
import com.Files.UploadFiles.repository.UserRepository;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Optional;
 

@SpringBootApplication
public class FilesDevApplication{
	
	
	public static void main(String[] args) {
		SpringApplication.run(FilesDevApplication.class, args);
	}
	
	
}


