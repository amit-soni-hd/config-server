package com.example.kafka.kafkaservice.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ProductRequest {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "price")
    private Integer price;

    @JsonProperty(value = "category")
    private String category;

}
