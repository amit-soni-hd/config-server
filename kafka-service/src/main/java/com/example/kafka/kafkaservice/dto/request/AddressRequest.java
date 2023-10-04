package com.example.kafka.kafkaservice.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AddressRequest {

    @JsonProperty(value = "flat_no")
    @NotBlank(message = "Please provide flat no")
    private String flatNo;

    @JsonProperty(value = "landmark")
    @NotBlank(message = "Please provode valid landmark")
    private String landmark;

    @JsonProperty(value = "area")
    private String area;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "state")
    private String state;

    @JsonProperty(value = "country")
    private String country;

    @JsonProperty(value = "pin_code")
    @Digits(integer = 6, fraction = 0, message = "Pin code length must be 6")
    @NotNull(message = "Please provide valid pin code")
    private Integer pinCode;
}
