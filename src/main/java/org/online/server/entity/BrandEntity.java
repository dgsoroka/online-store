package org.online.server.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "brand")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brandId")
    private List<DeviceEntity> devices;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "brands")
    private List<TypeEntity> types;

    public BrandEntity() {
    }

    public List<TypeEntity> getTypes() {
        return types;
    }

    public void setTypes(List<TypeEntity> types) {
        this.types = types;
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

    public List<DeviceEntity> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceEntity> devices) {
        this.devices = devices;
    }
}
