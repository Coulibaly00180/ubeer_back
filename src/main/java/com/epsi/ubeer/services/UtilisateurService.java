package com.epsi.ubeer.services;

import com.epsi.ubeer.repositories.UsersRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class UtilisateurService {

    @Autowired
    private UsersRepository utilisateurRepository;
}
