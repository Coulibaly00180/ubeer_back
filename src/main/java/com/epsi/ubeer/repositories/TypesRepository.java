package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "Types")
public interface TypesRepository extends CrudRepository<Type, Long> {
}
