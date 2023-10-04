package com.example.kafka.kafkaservice.service;

import com.example.kafka.kafkaservice.dao.jpa.ProductDao;
import com.example.kafka.kafkaservice.dto.request.ProductRequest;
import com.example.kafka.kafkaservice.dto.response.GenericResponse;
import com.example.kafka.kafkaservice.dto.response.ProductResponse;
import com.example.kafka.kafkaservice.model.jpa.Product;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.kafka.kafkaservice.utils.constant.RestConstant.SUCCESS_MESSAGE;
import static com.example.kafka.kafkaservice.utils.constant.RestConstant.SUCCESS_STATUS;

@Service(value = "PRODUCT_SERVICE")
@Slf4j
public class ProductServiceImpl {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ModelMapper modelMapper;

    public GenericResponse addProduct(ProductRequest request) {
        log.info("ProductServiceImpl -> Add product request : {}", request);
        Product product = modelMapper.map(request, Product.class);
        product = productDao.save(product);
        return buildProductResponse(product);
    }

    private GenericResponse buildProductResponse(Product product) {
        return new ProductResponse()
                .setProductId(product.getId())
                .setProductName(product.getName())
                .setMessage(SUCCESS_MESSAGE)
                .setStatus(SUCCESS_STATUS);
    }
}
