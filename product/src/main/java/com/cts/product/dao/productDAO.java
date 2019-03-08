package com.cts.product.dao;

import java.util.List;

import com.cts.product.bean.product;

//import com.cts.emplmngt.bean.Employee;

public interface productDAO {
public String addProduct(product product);

//public String UpdateEmployee(String id , Employee employee);
public String DeleteProduct(String id);
public product GetProductbyId(String id);
public List<product> getAllProduct();

}
