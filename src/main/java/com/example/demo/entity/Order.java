package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNumber;
    private String productCode;
    private Integer quantity;
    private Double priceEach;
    private Integer orderLineItem;
    private LocalDateTime orderDate;
    private LocalDateTime shippedDate;
    private String comments;
    private Integer customerNumber;
}
