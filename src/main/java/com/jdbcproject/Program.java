package com.jdbcproject;

import com.jdbcproject.model.dao.DaoFactory;
import com.jdbcproject.model.dao.SellerDao;
import com.jdbcproject.model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        
      SellerDao sellerDao = DaoFactory.createSellerDao();
      Seller seller = sellerDao.findById(3);
       
       System.out.println(seller);

    }
}
