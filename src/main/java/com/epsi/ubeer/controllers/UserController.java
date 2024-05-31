package com.epsi.ubeer.controllers;

import com.epsi.ubeer.models.Utilisateur;
import com.epsi.ubeer.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UtilisateurService utilisateurService;
}
