package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "product_variants")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ProductVariant {
    @Id
    private Integer variantId;
    private String productCode;
    private String variantName;
    private Double price;
}
