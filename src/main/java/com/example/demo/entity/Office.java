package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "offices")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String officeCode;
    private String city;
    private String state;
    private String phone;
    private String address;
    private String address2;
    private String country;
    private String postcode;
    private String territory;
}
