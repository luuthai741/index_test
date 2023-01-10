package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ProductLine {
    @Id
    private String productLine;
    private String description;
    private String image;
    private boolean status;
}
