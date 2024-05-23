package com.epsi.ubeer.repositories;

import com.epsi.ubeer.models.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "records", path = "stocks")
public interface StocksRepository extends CrudRepository<Stock, Long> {
}
