package com.example.kafka.kafkaservice.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CustomerRegistrationResponse extends GenericResponse {

    @JsonProperty(value = "customer_id")
    private Integer customerId;

    @JsonProperty(value = "customer_name")
    private String customerName;

}
