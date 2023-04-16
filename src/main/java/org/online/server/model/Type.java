package org.online.server.model;

import org.online.server.entity.BrandEntity;
import org.online.server.entity.DeviceEntity;
import org.online.server.entity.TypeEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Type {

    private Long id;
    private String name;
    private List<Device> devices;
    private List<Brand> brands;


    public static Type toModel(TypeEntity entity){
        Type model = new Type();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setDevices(entity.getDevices().stream().map(Device::toModel).collect(Collectors.toList()));
        model.setBrands(entity.getBrands().stream().map(Brand::toModel).collect(Collectors.toList()));

        return model;
    }

    public Type() {
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

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }
}
