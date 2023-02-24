package com.registro.comercio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;

@Data
@Entity
@Table(name = "Comercio")
public class Comerce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column (length = 50, name = "nombre", nullable = false)
    private String name;
    @Column(length = 10, name = "telefono", nullable = false)
    private String phone;
    @Column( name = "iva", nullable = false)
    private BigDecimal iva;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "comerce")
    ArrayList<Brach> braches ;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_representante", referencedColumnName = "id")
    private Representantive representantive;



}
