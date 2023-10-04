package com.example.kafka.kafkaservice.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class AddressResponse extends GenericResponse {

    @JsonProperty(value = "addressId")
    private Integer addressId;

    @JsonProperty(value = "address")
    private String address;
}
