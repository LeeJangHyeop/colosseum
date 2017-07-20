package com.jhsystems.colosseum.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by LeeJangHyeop on 2017. 7. 19..
 */
@Entity
public class User {
    @Id
    private String id;

    private String name;
    private int age;
    private String email;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
