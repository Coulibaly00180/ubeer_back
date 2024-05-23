package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Adresse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "addresses")
public interface AddressesRepository extends CrudRepository<Adresse, Long> {

}
