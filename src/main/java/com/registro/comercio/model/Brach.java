package com.registro.comercio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name = "Sucursal")
@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Brach {
    @Id
    @EqualsAndHashCode.Include
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
