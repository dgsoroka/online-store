package org.online.server.model;

import org.online.server.entity.BasketDeviceEntity;

public class BasketDevice {

    private Long id;
    private Long deviceId;
    private Long basketId;


    public static BasketDevice toModel(BasketDeviceEntity entity){
        BasketDevice model = new BasketDevice();
        model.setId(entity.getId());
        model.setDeviceId(entity.getDeviceId());
        model.setBasketId(entity.getBasketId());

        return model;
    }

    public BasketDevice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getBasketId() {
        return basketId;
    }

    public void setBasketId(Long basketId) {
        this.basketId = basketId;
    }
}
