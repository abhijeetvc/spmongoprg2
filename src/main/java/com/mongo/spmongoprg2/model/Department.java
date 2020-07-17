package com.mongo.spmongoprg2.model;

//@DBRef

import org.springframework.data.annotation.Id;

public class Department {
    @Id
    private String id;
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
