package com.example.kafka.kafkaservice.model.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "OrderDetails")
@Table(name = "order_details")
@Accessors(chain = true)
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "status")
    @Min(value = 0, message = "Please provide valid status (0-3)")
    @Max(value = 3, message = "Please provide valid status (0-3)")
    private Integer status;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "delivery_date")
    private LocalDateTime deliveryDate;

    @Column(name = "customer_id")
    private Integer customerId;
}
