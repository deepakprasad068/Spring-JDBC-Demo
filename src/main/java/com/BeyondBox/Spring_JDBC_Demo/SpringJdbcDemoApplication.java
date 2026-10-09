package com.BeyondBox.Spring_JDBC_Demo;

import com.BeyondBox.Spring_JDBC_Demo.Controller.ProductController;
import com.BeyondBox.Spring_JDBC_Demo.Model.Product;
import com.BeyondBox.Spring_JDBC_Demo.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext contex=SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Product product=contex.getBean(Product.class);
		ProductService productService=contex.getBean(ProductService.class);

		product.setId(4);
		product.setName("Apple");
		product.setPrice(120);
		productService.AddProduct(product);

	}

}
