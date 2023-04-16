package org.online.server.model;

import org.online.server.entity.*;

import java.util.List;
import java.util.stream.Collectors;

public class Device {

    private Long id;
    private String name;
    private Integer price;
    private List<Rating> ratings;
    private String img;
    private Type typeId;
    private Brand brandId;
    private List<DeviceInfo> deviceInfos;
    private BasketDevice basketDevice;


    public static Device toModel(DeviceEntity entity){
        Device model = new Device();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setPrice(entity.getPrice());
        model.setRatings(entity.getRatings().stream().map(Rating::toModel).collect(Collectors.toList()));
        model.setImg(entity.getImg());
        model.setTypeId(Type.toModel(entity.getTypeId()));
        model.setBrandId(Brand.toModel(entity.getBrandId()));
        model.setDeviceInfos(entity.getDeviceInfos().stream().map(DeviceInfo::toModel).collect(Collectors.toList()));
        model.setBasketDevice(BasketDevice.toModel(entity.getBasketDevice()));

        return model;
    }

    public Device() {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Type getTypeId() {
        return typeId;
    }

    public void setTypeId(Type typeId) {
        this.typeId = typeId;
    }

    public Brand getBrandId() {
        return brandId;
    }

    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }

    public List<DeviceInfo> getDeviceInfos() {
        return deviceInfos;
    }

    public void setDeviceInfos(List<DeviceInfo> deviceInfos) {
        this.deviceInfos = deviceInfos;
    }

    public BasketDevice getBasketDevice() {
        return basketDevice;
    }

    public void setBasketDevice(BasketDevice basketDevice) {
        this.basketDevice = basketDevice;
    }
}
