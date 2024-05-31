package com.epsi.ubeer.services;

import com.epsi.ubeer.models.Utilisateur;
import com.epsi.ubeer.repositories.UsersRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UtilisateurService {

    @Autowired
    private UsersRepository utilisateurRepository;
    @Autowired
    private UsersRepository usersRepository;

    public Optional<Utilisateur> getUserByAuth0Id(String auth0Id) {
        return Optional.ofNullable(usersRepository.findByAuth0Id(auth0Id));
    }

    public Utilisateur createUtlisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
}
