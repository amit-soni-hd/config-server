package com.example.kafka.kafkaservice.controller;

import com.example.kafka.kafkaservice.dto.request.ProductRequest;
import com.example.kafka.kafkaservice.dto.response.GenericResponse;
import com.example.kafka.kafkaservice.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.example.kafka.kafkaservice.utils.constant.EndPoints.ADD;
import static com.example.kafka.kafkaservice.utils.constant.EndPoints.PRODUCT;

@RestController(value = "ProductController")
@RequestMapping(value = PRODUCT)
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping(ADD)
    public ResponseEntity<GenericResponse> addProduct(@Valid @RequestBody ProductRequest request) {
        return ResponseEntity.ok(productService.addProduct(request));
    }
}
