package com.example.TddTest.Repository;

import com.example.TddTest.Model.Wine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WineRepository extends MongoRepository<Wine, String> {
}
