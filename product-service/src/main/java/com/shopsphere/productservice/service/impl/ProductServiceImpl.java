package com.shopsphere.productservice.service.impl;

import com.shopsphere.productservice.dto.ProductRequest;
import com.shopsphere.productservice.entity.Product;
import com.shopsphere.productservice.repository.ProductRepository;
import com.shopsphere.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(ProductRequest request) {
        Product product = new Product(request.getName(), request.getDescription(), request.getPrice());
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
