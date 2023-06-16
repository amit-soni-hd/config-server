package com.example.kafka.kafkaservice.model.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static com.example.kafka.kafkaservice.utils.constant.RestConstant.MOBILE_REGEX;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Customer")
@Table(name = "customer")
@Accessors(chain = true)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only letters and spaces")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Gender is required")
    @Pattern(regexp = "^(Male|Female|Other)$", message = "Invalid gender value (must be Male,Female,Other )")
    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    @Email(message = "Please provide valid email address")
    private String email;

    @Column(name = "mobile")
    @Pattern(regexp = MOBILE_REGEX, message = "Please provide valid mobile")
    private String mobile;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
}
