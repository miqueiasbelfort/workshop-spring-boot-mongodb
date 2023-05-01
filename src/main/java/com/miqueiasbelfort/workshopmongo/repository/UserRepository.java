package com.miqueiasbelfort.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.miqueiasbelfort.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
