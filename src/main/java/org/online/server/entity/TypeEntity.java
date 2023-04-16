package org.online.server.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "type")
public class TypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeId")
    private List<DeviceEntity> devices;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "types")
    private List<BrandEntity> brands;

    public TypeEntity() {
    }

    public List<BrandEntity> getBrands() {
        return brands;
    }

    public void setBrands(List<BrandEntity> brands) {
        this.brands = brands;
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
