package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.dto.ProductDto;
import com.ecommerce.Ecommerce.model.Category;
import com.ecommerce.Ecommerce.model.Product;
import com.ecommerce.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void createProduct(ProductDto productDto, Category category) {
        Product product =new Product();
        product.setDiscription(productDto.getDiscription());
        product.setImageurl(productDto.getImageurl());
        product.setName(productDto.getName());
        product.setCategory(category);
        product.setPricr(productDto.getPricr());
        productRepository.save(product);
    }

    public ProductDto getProductDto(Product product) {
        ProductDto productDto =new ProductDto();
        productDto.setDiscription(product.getDiscription());
        productDto.setImageurl(product.getImageurl());
        productDto.setName(product.getName());
        productDto.setCategoryId(product.getCategory().getId());
        productDto.setPricr(product.getPricr());
        productDto.setId(product.getId());
        return productDto;
    }
    public List<ProductDto> getAllProducts() {
         List<Product> allProducts = productRepository.findAll();

         List<ProductDto> productDtos =new ArrayList<>();
         for (Product product: allProducts){
             productDtos.add(getProductDto(product));
         }
         return productDtos;
    }

    public void updateProduct(ProductDto productDto, Integer productId) throws Exception {
       Optional<Product> optionalProduct = productRepository.findById(productId);
    if (!optionalProduct.isPresent()) {
        throw new Exception("product not present");
    }
     Product product = optionalProduct.get();
        product.setDiscription(productDto.getDiscription());
        product.setImageurl(productDto.getImageurl());
        product.setName(productDto.getName());
        product.setPricr(productDto.getPricr());
        productRepository.save(product);

    }

}
