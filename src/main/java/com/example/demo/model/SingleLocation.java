package com.example.demo.model;

import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@RedisHash("Location")
public class SingleLocation implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
