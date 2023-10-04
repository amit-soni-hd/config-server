package com.example.kafka.kafkaservice.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class GenericResponse {

    @JsonProperty(value = "status")
    private Integer status;

    @JsonProperty(value = "message")
    private String message;

}
