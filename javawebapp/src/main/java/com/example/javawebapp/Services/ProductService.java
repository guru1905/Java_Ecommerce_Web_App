package com.example.javawebapp.Services;
import com.example.javawebapp.Model.Product;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"Android",50000),
            new Product(102,"swift",2000),
            new Product(103,"MacOS",90000));
    public List<Product> getProducts(){
        return products;
    }
    public Product getproductid(int product_id){
        return products.stream()
                .filter(p->p.getProduct_id()==product_id)
                .findFirst().get();
    }

}
