package com.example.March8Spring.jpa.controller;

import com.example.March8Spring.jpa.dao.ProductDao;
import com.example.March8Spring.jpa.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductDao productDao;

    @PostMapping("/addProduct")
    public String saveProducts(@RequestBody Products product){
        return productDao.addProduct(product);

    }
}
