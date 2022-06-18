package com.santana.back.end.application.controller;

import com.santana.back.end.application.model.ProductDTO;
import com.santana.back.end.application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> getProducts(){
        List<ProductDTO> produtos = productService.getAll();
        return produtos;
    }

    @GetMapping("/products/category/{categoryId}")
    public List<ProductDTO> getProductByCategory(@PathVariable Long categoryId){
        List<ProductDTO> produtos = productService.getProductByCategoryId(categoryId);
        return produtos;
    }

    @GetMapping("/product/{productIdentifier}")
    public ProductDTO findById(@PathVariable String productIdentifier){
        return productService.findByProductIdentifier(productIdentifier);
    }

    @PostMapping("/newProduct")
    ProductDTO newProduct(@Valid @RequestBody ProductDTO productDTO){
        return productService.save(productDTO);
    }

    @DeleteMapping("/product/{id}")
    ProductDTO delete(@PathVariable Long id) {
        return productService.delete(id);
    }
}
