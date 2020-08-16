package com.it.sim_library.pojo;

import java.io.Serializable;

public class Book implements Serializable {
private Integer id;

    private String name;
    private String category;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Book(Integer id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }


}
