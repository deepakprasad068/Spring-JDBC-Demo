package com.BeyondBox.Spring_JDBC_Demo.Controller;

import com.BeyondBox.Spring_JDBC_Demo.Model.Product;
import com.BeyondBox.Spring_JDBC_Demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    //Getting All Product in Database
    @GetMapping("/product")
    public List<Product> GetProducts()
    {
        return productService.GetProduct();
    }

    //Getting Single Product As per id from data base
    @GetMapping("/product/{productId}")
    public  String  GetProductById(@PathVariable int productId)
    {
        return productService.GetProductById(productId);
    }

    //Adding Product in Database
    @PostMapping("/AddProduct")
    public String AddProduct(@RequestBody Product product)
    {

        return productService.AddProduct(product);
    }
    //Updating Product data from data base
    @PutMapping("/product/{id}")
    public String UpdateProduct(@PathVariable int id)
    {
        return productService.UpdateProduct(id);
    }
    //Deleting Product from data base
    @DeleteMapping("/product/{id}")
    public String DeleteProduct(@PathVariable int id)
    {
        return productService.DeleteProduct();

    }
}
