package com.example.kafka.kafkaservice.model.sql;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Address")
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    @JsonProperty(value = "address_id")
    private Integer addressId;

    @JsonProperty(value = "plot_no")
    @Column(name = "plot_no")
    private String plotNo;

    @Column(name = "address_line")
    @JsonProperty(value = "address_line")
    private String addressLine;

    @Column(name = "city")
    @JsonProperty(value = "city")
    private String city;

    @Column(name = "state")
    @JsonProperty(value = "state")
    private String state;

    @Column(name = "country")
    @JsonProperty(value = "country")
    private String country;

    @Column(name = "pin_code")
    @JsonProperty(value = "pin_code")
    private Integer pinCode;

    @ManyToMany
    private List<Employee> employees;
}
