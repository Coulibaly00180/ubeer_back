package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.LigneCommande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "details_commands")
public interface DetailsCommandsRepository extends CrudRepository<LigneCommande, Long> {
}
