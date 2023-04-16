package org.online.server.repository;

import org.online.server.entity.DeviceInfoEntity;
import org.springframework.data.repository.CrudRepository;

public interface DeviceInfoRepo extends CrudRepository<DeviceInfoEntity, Long> {
}
