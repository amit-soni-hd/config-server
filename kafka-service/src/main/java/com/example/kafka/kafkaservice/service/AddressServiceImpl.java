package com.example.kafka.kafkaservice.service;

import com.example.kafka.kafkaservice.dto.request.AddressRequest;
import com.example.kafka.kafkaservice.dto.response.AddressResponse;
import com.example.kafka.kafkaservice.dto.response.GenericResponse;
import com.example.kafka.kafkaservice.model.jpa.Address;
import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "AddressService")
@Slf4j
public class AddressServiceImpl {

//    @Autowired
//    private AddressDao addressDao;

    @Autowired
    private ModelMapper modelMapper;

    public GenericResponse addAddress(AddressRequest request) {
        log.info("AddressServiceImpl -> Add address request : {}", request);
        Address address = modelMapper.map(request, Address.class);
//        address = addressDao.save(address);
        return buildResponse(address);
    }

    private GenericResponse buildResponse(Address address) {
        return new AddressResponse()
                .setAddressId(address.getId())
                .setAddress(getAddress(address))
                .setMessage("Success")
                .setStatus(1);
    }

    private String getAddress(Address address) {
        return getValue(address.getFlatNo())
                .concat(getValue(address.getLandmark()))
                .concat(getValue(address.getArea()))
                .concat(getValue(address.getCity()))
                .concat(getValue(address.getState()))
                .concat(getValue(address.getCountry()))
                .concat("(" + getValue(address.getPinCode().toString()).replace(",", "") + ")")
                .trim();
    }

    private String getValue(String value) {
        return StringUtils.isNotBlank(value) ? value.concat(",") : "";
    }
}
