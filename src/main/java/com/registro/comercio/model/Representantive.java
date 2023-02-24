package com.registro.comercio.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Representante")
@Entity
@Data
public class Representantive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false, name = "nombre")
    private String name;
    @Column(length = 50, nullable = false, name = "apellido")
    private String lastName;
    @Column(length = 10, nullable = false, name = "telefono")
    private String phone;
    @OneToOne(mappedBy = "representantive")
    private Comerce comerce;
}
