package org.online.server.repository;

import org.online.server.entity.BasketEntity;
import org.springframework.data.repository.CrudRepository;

public interface BasketRepo extends CrudRepository<BasketEntity, Long> {
}
