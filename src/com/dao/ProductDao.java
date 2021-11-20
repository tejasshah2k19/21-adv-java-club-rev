package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

			int i = pstmt.executeUpdate();// 1
			if (i == 1) {
				System.out.println("product saved...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//
	public ArrayList<ProductBean> getAllProducts() {
		ArrayList<ProductBean> products = new ArrayList<ProductBean>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products");
			// select
			ResultSet rs = pstmt.executeQuery(); // table

			while (rs.next()) {
				ProductBean proBean = new ProductBean();
				proBean.setProductId(rs.getInt("productId"));
				proBean.setName(rs.getString("name"));
				proBean.setQty(rs.getInt("qty"));
				proBean.setPrice(rs.getInt("price"));
				products.add(proBean);// 1 2 3 .....
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}

	public void deleteProduct(int productId) {

		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from products where productId = ?");
			pstmt.setInt(1, productId);

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
