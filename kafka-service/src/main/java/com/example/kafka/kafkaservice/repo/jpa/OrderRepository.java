package com.example.kafka.kafkaservice.repo.jpa;

import com.example.kafka.kafkaservice.model.jpa.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {
}
