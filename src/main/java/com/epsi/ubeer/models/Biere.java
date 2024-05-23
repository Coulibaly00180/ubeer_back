package com.epsi.ubeer.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Biere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "type", nullable = false)
    private Type type;

    @ManyToOne
    @JoinColumn(name = "volume", nullable = false)
    private Volume volume;
}
