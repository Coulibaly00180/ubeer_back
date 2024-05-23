package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "commands")
public interface CommandsRepository extends CrudRepository<Commande, Long> {
}
