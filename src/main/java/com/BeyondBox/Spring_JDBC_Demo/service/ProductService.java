package com.BeyondBox.Spring_JDBC_Demo.service;

import com.BeyondBox.Spring_JDBC_Demo.Model.Product;
import com.BeyondBox.Spring_JDBC_Demo.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;



    public List<Product> GetProduct()
    {
        //get products

        return productRepo.GetProductData();

    }
    public String GetProductById(int id)
    {
        //get single product
        return "Get Single Product By Id";
    }
    public String AddProduct(Product product)
    {
        //Adding Product
        productRepo.SaveProductData(product);

        return "Adding Product";

    }
    public String UpdateProduct(int id)
    {
        //Update product
        return "UpdateProduct";
    }
    public String DeleteProduct()
    {
        //delete product
        return "Delete Product";
    }

}
