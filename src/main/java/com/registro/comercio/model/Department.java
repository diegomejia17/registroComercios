package com.registro.comercio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Table(name = "Departamento")
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "department")
    ArrayList<Brach> braches;

}
