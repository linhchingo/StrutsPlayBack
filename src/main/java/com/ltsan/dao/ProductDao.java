package com.ltsan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltsan.model.Product;
import com.ltsan.utils.JDBCConnection;

public class ProductDao {
	
	
	private Connection connection = JDBCConnection.getJDBCConnection();
	
	//Get all product
	public List<Product> getProducts(){
		ArrayList<Product> products = new ArrayList<Product>();
		
		String sql = "select * from product";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setSex(resultSet.getBoolean("sex"));
				product.setFeature(resultSet.getString("feature"));
				product.setType(resultSet.getString("type"));
				product.setSupplier(resultSet.getString("supplier"));
				products.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return products;
	}

	//Get 1 Product
	public Product getProductById(int id) {
		String sql = "select * from product where id = ?";

		
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setSex(resultSet.getBoolean("sex"));
				product.setFeature(resultSet.getString("feature"));
				product.setType(resultSet.getString("type"));
				product.setSupplier(resultSet.getString("supplier"));
				return product;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	//Add Product
	public void addProduct (Product product) {
		
		String sql = "INSERT INTO product(name,quantity,sex,feature,type,supplier) VALUE (?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getQuantity());
			preparedStatement.setBoolean(3, product.isSex());
			preparedStatement.setString(4, product.getFeature());
			preparedStatement.setString(5, product.getType());
			preparedStatement.setString(6, product.getSupplier());
			
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
