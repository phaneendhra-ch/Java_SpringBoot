package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.MyUserModels;
import com.example.demo.Repositories.MyUserRepositories;

@Service
public class MyUserServices {
    
    @Autowired
    private MyUserRepositories UserRepository;

    public MyUserModels saveUser(MyUserModels user){
        return  UserRepository.save(user);
    }
    public List<MyUserModels> getAllUsers(){
        return UserRepository.findAll();
    }

    public Optional<MyUserModels> getUser(ObjectId id){
        return UserRepository.findById(id);
    }

}
