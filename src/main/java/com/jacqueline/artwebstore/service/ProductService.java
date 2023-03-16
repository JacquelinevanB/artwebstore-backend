package com.jacqueline.artwebstore.service;

import java.util.List;

import com.jacqueline.artwebstore.entity.Product;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long id);
    Product saveProduct(Product product);
    // Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
