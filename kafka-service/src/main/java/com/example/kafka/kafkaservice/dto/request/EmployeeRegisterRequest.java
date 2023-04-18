package com.example.kafka.kafkaservice.dto.request;

import com.example.kafka.kafkaservice.model.sql.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class EmployeeRegisterRequest {

    @JsonProperty(value = "emp_code")
    private String empCode;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "contact_no")
    private String contactNo;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "addresses")
    private List<Address> addresses;
}
