package com.BeyondBox.Spring_JDBC_Demo.Repo;

import com.BeyondBox.Spring_JDBC_Demo.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void SaveProductData(Product product)
    {
        String sql= "insert into PRODUCT(Id,Name,Price)values(?,?,?); ";

        jdbcTemplate.update(sql,product.getId(),product.getName(),product.getPrice());

        System.out.println(product);
        // save product Data in Data base
    }
    public List<Product> GetProductData()
    {
        RowMapper<Product>mapper=new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

                Product a=new Product();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setPrice(rs.getInt(3));

                return a;
            }
        };
        String sql ="select * from PRODUCT;";
        List<Product>products= jdbcTemplate.query(sql,mapper);
        return products;

    }

}
