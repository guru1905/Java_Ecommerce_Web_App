package com.example.javawebapp.Model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int product_id;
    private String prodName;
    private int price;

    public Product(){

    }

    public Product(int productid, String prodName, int price) {
        this.product_id = productid;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}

