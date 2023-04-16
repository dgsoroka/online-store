package org.online.server.repository;

import org.online.server.entity.BrandEntity;
import org.springframework.data.repository.CrudRepository;

public interface BrandRepo extends CrudRepository<BrandEntity, Long> {
}
