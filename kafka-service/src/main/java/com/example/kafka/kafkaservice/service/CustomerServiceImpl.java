package com.example.kafka.kafkaservice.service;

import com.example.kafka.kafkaservice.dao.jpa.CustomerDao;
import com.example.kafka.kafkaservice.dto.request.CustomerRegistrationRequest;
import com.example.kafka.kafkaservice.dto.response.CustomerRegistrationResponse;
import com.example.kafka.kafkaservice.dto.response.GenericResponse;
import com.example.kafka.kafkaservice.model.jpa.Customer;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.kafka.kafkaservice.utils.constant.RestConstant.SUCCESS_MESSAGE;
import static com.example.kafka.kafkaservice.utils.constant.RestConstant.SUCCESS_STATUS;

@Service("CUSTOMER_SERVICE")
@Slf4j
public class CustomerServiceImpl {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private ModelMapper modelMapper;

    public GenericResponse signUp(CustomerRegistrationRequest request) {
        log.info("CustomerService -> Add customer request : {}", request);

        Customer employee = modelMapper.map(request, Customer.class);
        employee = customerDao.save(employee);

        return buildCustomerResponse(employee);
    }

    private GenericResponse buildCustomerResponse(Customer customer) {
        return new CustomerRegistrationResponse()
                .setCustomerId(customer.getId())
                .setCustomerName(customer.getName())
                .setStatus(SUCCESS_STATUS)
                .setMessage(SUCCESS_MESSAGE);
    }
}
