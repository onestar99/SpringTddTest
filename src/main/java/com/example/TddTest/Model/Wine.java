package com.example.TddTest.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "wines")
public class Wine {

    @Id
    private String id;
    private String name;
    private String country;
    private String variety;
    private Double price;

}
