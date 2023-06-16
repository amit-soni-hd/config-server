package com.example.kafka.kafkaservice.model.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Digits;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity(name = "Address")
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "flat_no")
    private String flatNo;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "area")
    private String area;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pin_code")
    @Digits(integer = 6, fraction = 0, message = "Pin code length must be 6")
    private Integer pinCode;
}
