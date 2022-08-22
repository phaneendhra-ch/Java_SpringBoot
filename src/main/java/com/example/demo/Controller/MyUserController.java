package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.MyUserModels;
import com.example.demo.Repositories.MyUserRepositories;
import com.example.demo.Service.MyUserServices;

@RestController
public class MyUserController {
    // AutoWired not required for models

    @Autowired
    MyUserServices UserService;

    @Autowired
    private MyUserRepositories UserRepository;
    
    @PostMapping("/addUser/")
    public MyUserModels saveUser(@RequestBody MyUserModels MyUserModel){
        return UserRepository.save(MyUserModel);
    }

    @GetMapping("/getallusers")
    public List<MyUserModels>getAllUsers()
    {
        return UserService.getAllUsers();
    }
}
