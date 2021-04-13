package com.company.PrivExample.ProtExample.PrivExample;

public class Product {

    private String name;

    public Product(){
        this.name = "Unknown";
    }

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + " !";
    }
}
