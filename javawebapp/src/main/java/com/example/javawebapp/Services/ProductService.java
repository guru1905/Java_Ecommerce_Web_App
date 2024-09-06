package com.example.javawebapp.Services;
import com.example.javawebapp.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Android",50000),
            new Product(102,"swift",2000),
            new Product(103,"MacOS",90000)));
    public List<Product> getProducts(){
        return products;
    }
    public Product getproductid(int product_id){
        return products.stream()
                .filter(p->p.getProduct_id()==product_id)
                .findFirst().get();
    }
    public  void addproduct(Product prod){
        System.out.println(prod);
        products.add( prod);
    }

    public void updateproduct(Product prod) {
        int index=0;
        for(int i=0;i< products.size();i++){
            if(products.get(i).getProduct_id()==prod.getProduct_id()){
                index=i;
            }

        }
        products.set(index,prod);

    }

    public void deleteproduct(int productId) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProduct_id()==productId){
                index=i;
            }
        }
        products.remove(index);
    }
}
