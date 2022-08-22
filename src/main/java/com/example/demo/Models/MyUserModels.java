package com.example.demo.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


@Data
@Document(collection = "MyUsers")
public class MyUserModels {
    
    @Id
    private ObjectId id;
    private String FirstName;
    private String LastName;
    private String password;
}
