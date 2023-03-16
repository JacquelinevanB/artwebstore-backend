package com.jacqueline.artwebstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Productnaam is verplicht")
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
    
    @NotBlank(message = "Voorraad is verplicht")
    @Column(name = "stock", nullable = false)
    private int stock;

    @NotBlank(message = "Prijs is verplicht")
    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "image")
    private String imgUrl;

}