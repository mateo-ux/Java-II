package com.microservice.productos.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
