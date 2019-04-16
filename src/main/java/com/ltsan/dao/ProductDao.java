package com.ltsan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ltsan.model.Product;
import com.ltsan.utils.JDBCConnection;

public class ProductDao {

	public Product getProductById(int id) {
		String sql = "select * from product where id = ?";

		Connection connection = JDBCConnection.getJDBCConnection();
		
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
	
}
