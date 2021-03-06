package com.day.service;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.day.dao.ProductDAO;
import com.day.dao.ProductDAOFile;
import com.day.dto.Product;
import com.day.exception.FindException;

public class ProductService {
	private ProductDAO dao;
	private static ProductService service = new ProductService(); //싱글톤패턴. 외부에서 새로 객체를 만들 수 없도록.
	private ProductService() {

		Properties env = new Properties();
		try {
			env.load(new FileInputStream("classes.prop"));
			String className = env.getProperty("productDAO");
			Class c = Class.forName(className);
			dao = (ProductDAO) c.newInstance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

	static public ProductService getInstance() { //외부에서 호출할 수 있도록. 
		return service;
	}

	public List<Product> findAll() throws FindException {
		return dao.selectAll();
	}
	
	public List<Product> findAll(int currentPage) throws FindException {
		return dao.selectAll(currentPage);
	}
	
	public Product findByNo(String prod_no) throws FindException {
		//상품번호를 복호화
		//dao.selectByNo(복호화된 값);
		return dao.selectByNo(prod_no);
	}
	
	public List<Product> findByName(String word) throws FindException {
		return dao.selectByName(word);
	}
	
	public static void main(String[] args) {
		ProductService service = ProductService.getInstance();
		
		try {
			List<Product> all = service.findAll();
			for (Product p : all) {
				System.out.println(p);
			}
		} catch (FindException e) {
			e.printStackTrace();
		}
	}
}
