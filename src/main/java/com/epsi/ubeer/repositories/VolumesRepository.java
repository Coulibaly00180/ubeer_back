package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Volume;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "volumes")
public interface VolumesRepository extends CrudRepository<Volume, Long> {
}