package com.registro.comercio.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Sucursal")
@Entity
@Data
public class Brach {
    @Id
    private Long id;
    @Column(length = 50, nullable = false, name = "direccion")
    private String address;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_comercio")
    private Comerce comerce;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_departamento")
    private Department department;

}
