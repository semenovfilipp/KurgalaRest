package org.example.services;

import org.example.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product(++ID,"PS5","Slim",2000));
        products.add(new Product(++ID,"XBOX","FAT",1490));

    }
    public List <Product> listProducts(){
        return listProducts();
    }
    public void safeProduct(Product product){
        product.setId(ID++);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
