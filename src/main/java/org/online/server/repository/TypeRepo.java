package org.online.server.repository;

import org.online.server.entity.TypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepo extends CrudRepository<TypeEntity, Long> {
}
