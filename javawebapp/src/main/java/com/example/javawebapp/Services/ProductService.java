package com.example.javawebapp.Services;
import com.example.javawebapp.Model.Product;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"Android",50000),
            new Product(102,"swift",2000));
    public List<Product> getProducts(){
        return products;
    }

}
