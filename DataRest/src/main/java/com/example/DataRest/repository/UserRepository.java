package com.example.DataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.DataRest.model.User;

@RepositoryRestResource(path ="users") //collectionResourceRel="users",
public interface UserRepository extends JpaRepository<User, Long> {

}
