package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Brasserie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "breweries")
public interface BreweriesRepository extends CrudRepository<Brasserie, Long> {
}
