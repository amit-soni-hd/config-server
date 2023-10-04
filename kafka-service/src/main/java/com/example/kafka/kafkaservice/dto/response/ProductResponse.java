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
public class ProductResponse extends GenericResponse {

    @JsonProperty(value = "product_id")
    private Integer productId;

    @JsonProperty(value = "product_name")
    private String productName;
}
