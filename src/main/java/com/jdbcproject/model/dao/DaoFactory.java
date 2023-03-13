package com.jdbcproject.model.dao;

import com.jdbcproject.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
    
}
