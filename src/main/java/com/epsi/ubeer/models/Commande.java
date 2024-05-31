package com.epsi.ubeer.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
@Getter
@Setter
public class Commande {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateCommande")
    private LocalDateTime dateCommande;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur", nullable = false)
    private Utilisateur utilisateur;
}
