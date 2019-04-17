package com.ltsan.service;

import java.util.List;

import com.ltsan.dao.ProductDao;
import com.ltsan.model.Product;

public class ProductService {	
	private ProductDao  productDao;

	public ProductService() {
		productDao = new ProductDao();
	}

	public List<Product> getProducts(){
		return productDao.getProducts();
	}
	
	public Product findProductById(int id) {
		return productDao.getProductById(id);
	}
	
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}
}
