package com.mruruc.upperboundwildcard;

public class Mac{
    private String brand;
    private Double price;

    public Mac(String brand, Double price) {
       this.brand=brand;
       this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
