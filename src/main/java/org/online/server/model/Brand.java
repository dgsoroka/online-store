package org.online.server.model;

import org.online.server.entity.BrandEntity;
import org.online.server.entity.DeviceEntity;
import org.online.server.entity.TypeEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Brand {

    private Long id;
    private String name;
    private List<Device> devices;
    private List<Type> types;


    public static Brand toModel(BrandEntity entity){
        Brand model = new Brand();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setDevices(entity.getDevices().stream().map(Device::toModel).collect(Collectors.toList()));
        model.setTypes(entity.getTypes().stream().map(Type::toModel).collect(Collectors.toList()));

        return model;
    }

    public Brand() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}
