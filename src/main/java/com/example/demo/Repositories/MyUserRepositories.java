package com.example.demo.Repositories;

import java.util.Optional;

import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.Models.MyUserModels;


@Repository
public interface MyUserRepositories extends MongoRepository<MyUserModels,ObjectId>{
    // Optional<MyUserModels> findById(ObjectId id);       // the query for schema starts with findBy..

}
