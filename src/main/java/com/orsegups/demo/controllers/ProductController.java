package com.orsegups.demo.controllers;

import com.orsegups.demo.entities.Department;
import com.orsegups.demo.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects(){

        Department dep1 = new Department(1L,"Tech");
        Department dep2 = new Department(2L,"Pet House");

        Product p1= new Product(1L, "Itautec",4.000,dep1);
        Product p2= new Product(2L, "PC da Xuxa",1.000,dep1);
        Product p3= new Product(3L, "Toto Feliz",11.0,dep2);

        List<Product> list = Arrays.asList(p1,p2,p3);


        return list;

    }

}
