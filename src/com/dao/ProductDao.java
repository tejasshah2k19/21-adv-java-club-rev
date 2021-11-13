package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.ProductBean;
import com.util.DbConnection;

public class ProductDao {

	public void saveProduct(ProductBean product) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into products (name,price,qty) values (?,?,?) ");
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQty());

			// insert update delete

			int i = pstmt.executeUpdate();//1 
			if(i == 1) {
				System.out.println("product saved...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
