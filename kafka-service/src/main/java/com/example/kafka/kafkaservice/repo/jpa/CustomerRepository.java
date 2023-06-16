package com.example.kafka.kafkaservice.repo.jpa;

import com.example.kafka.kafkaservice.model.jpa.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
