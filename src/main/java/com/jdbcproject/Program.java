package com.jdbcproject;

import java.util.Date;

import com.jdbcproject.model.entities.Department;
import com.jdbcproject.model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        
       Department obj = new Department(1,"Books");

       Seller seller = new Seller(23, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

       System.out.println(seller);


    }
}