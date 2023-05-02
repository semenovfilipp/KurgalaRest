package org.example.controllers;


import org.example.models.Product;
import org.example.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    public final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String products(Model model){
        model.addAllAttributes("products", productService.listProducts());
        return "products";
    }

    @GetMapping("/product{id}")
    public String productInfo(@PathVariable Long id, Model model){
        model.addAllAttributes("product", productService.getProductById(id)){
            return "product-info";
        }
    }

    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.safeProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
