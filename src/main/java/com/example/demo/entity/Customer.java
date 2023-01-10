package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerNumber;
    private String customerFirstname;
    private String customerLastname;
    private String phone;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private Long employeeId;
}
