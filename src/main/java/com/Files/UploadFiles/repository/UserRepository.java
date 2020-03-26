package com.Files.UploadFiles.repository;


import com.Files.UploadFiles.domain.User;
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepository  extends ReactiveCosmosRepository<User, String> {
    Flux<User> findByFirstName(String firstName);
}