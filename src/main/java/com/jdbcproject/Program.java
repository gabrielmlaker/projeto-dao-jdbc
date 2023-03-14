package com.jdbcproject;

import java.util.List;

import com.jdbcproject.model.dao.DaoFactory;
import com.jdbcproject.model.dao.SellerDao;
import com.jdbcproject.model.entities.Department;
import com.jdbcproject.model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
            
        }
    }
}
