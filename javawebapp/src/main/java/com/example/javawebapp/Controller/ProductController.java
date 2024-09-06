package com.example.javawebapp.Controller;
import java.util.List;

import com.example.javawebapp.Model.Product;
import com.example.javawebapp.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")

    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{product_id}")
    public Product getproductid(@PathVariable int product_id){
        return service.getproductid(product_id);
    }
    @PostMapping("/products")
    public void addproduct(@RequestBody Product prod){
        service.addproduct(prod);

    }
    @PutMapping("/products")
    public void updateproduct(@RequestBody Product prod){
        service.updateproduct(prod);
    }
    @DeleteMapping("/products/{product_id}")
    public void deleteproduct(@PathVariable int product_id){
        service.deleteproduct(product_id);
    }
}
