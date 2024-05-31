package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "users")
public interface UsersRepository extends CrudRepository<Utilisateur, Long> {
    Utilisateur findByAuth0Id(String auth0Id);
}
