package org.online.server.model;

import org.online.server.entity.DeviceEntity;
import org.online.server.entity.DeviceInfoEntity;

public class DeviceInfo {

    private Long id;
    private Device device;
    private String title;
    private String description;

    public static DeviceInfo toModel(DeviceInfoEntity entity){
        DeviceInfo model = new DeviceInfo();
        model.setId(entity.getId());
        model.setDevice(Device.toModel(entity.getDevice()));
        model.setTitle(entity.getTitle());
        model.setDescription(entity.getDescription());

        return model;
    }

    public DeviceInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
