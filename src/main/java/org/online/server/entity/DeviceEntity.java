package org.online.server.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "device")
public class DeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "device")
    private List<RatingEntity> ratings;
    private String img;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeEntity typeId;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brandId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "device")
    private List<DeviceInfoEntity> deviceInfos;

    @OneToOne(mappedBy = "deviceId")
    private BasketDeviceEntity basketDevice;

    public DeviceEntity() {
    }

    public List<RatingEntity> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingEntity> ratings) {
        this.ratings = ratings;
    }

    public List<DeviceInfoEntity> getDeviceInfos() {
        return deviceInfos;
    }

    public void setDeviceInfos(List<DeviceInfoEntity> deviceInfos) {
        this.deviceInfos = deviceInfos;
    }

    public BasketDeviceEntity getBasketDevice() {
        return basketDevice;
    }

    public void setBasketDevice(BasketDeviceEntity basketDevice) {
        this.basketDevice = basketDevice;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public TypeEntity getTypeId() {
        return typeId;
    }

    public void setTypeId(TypeEntity typeId) {
        this.typeId = typeId;
    }

    public BrandEntity getBrandId() {
        return brandId;
    }

    public void setBrandId(BrandEntity brandId) {
        this.brandId = brandId;
    }
}
