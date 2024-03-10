package com.abutua.sellerregister.entities;

import com.abutua.sellerregister.DTOs.SellerResponse;

public class Seller {

    private Long id;
    private String name;
    private Double salary;
    private Double bonus;
    private String gender;

    // Empty Constructor
    public Seller() {
        
    }

    // Constructor without the id
    public Seller(String name, Double salary, Double bonus, String gender) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.gender = gender;
    }

    // Converts from SellerEntity to SellerResponse
    public SellerResponse toSellerResponse(){
        return new SellerResponse(id, name, salary, bonus, gender);
    }

    // Setters and Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}