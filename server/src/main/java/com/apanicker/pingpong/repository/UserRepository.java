package com.apanicker.pingpong.repository;

import com.apanicker.pingpong.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
