package com.epsi.ubeer.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantite")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "id_biere")
    private Biere biere;

    @ManyToOne
    @JoinColumn(name = "id_brasserie")
    private Brasserie brasserie;
}
