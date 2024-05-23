package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Biere;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "beers")
public interface BeersRepository extends CrudRepository<Biere, Long> {
}
