package com.example.javawebapp.Controller;
import java.util.List;

import com.example.javawebapp.Model.Product;
import com.example.javawebapp.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products")

    public List<Product> getProducts(){
        return service.getProducts();
    }
    @RequestMapping("/products/{product_id}")
    public Product getproductid(@PathVariable int product_id){
        return service.getproductid(product_id);
    }
}
