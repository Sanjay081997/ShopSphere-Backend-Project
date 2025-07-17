package com.shopsphere.productservice.service;

import com.shopsphere.productservice.dto.ProductRequest;
import com.shopsphere.productservice.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductRequest request);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void deleteProduct(Long id);
}
