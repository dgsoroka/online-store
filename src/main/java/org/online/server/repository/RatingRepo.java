package org.online.server.repository;

import org.online.server.entity.RatingEntity;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepo extends CrudRepository<RatingEntity, Long> {
}
