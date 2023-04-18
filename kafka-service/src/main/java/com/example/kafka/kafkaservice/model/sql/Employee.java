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
@Entity(name = "Employee")
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    @JsonProperty(value = "emp_id")
    private Integer empId;

    @Column(name = "emp_code")
    @JsonProperty(value = "emp_code")
    private String empCode;

    @Column(name = "name")
    @JsonProperty(value = "name")
    private String name;

    @Column(name = "contact_no")
    @JsonProperty(value = "contact_no")
    private String contactNo;

    @Column(name = "email")
    @JsonProperty(value = "email")
    private String email;

    @ManyToMany
    private List<Address> addresses;

}
