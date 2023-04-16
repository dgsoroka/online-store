package org.online.server.model;

import org.online.server.entity.BasketDeviceEntity;
import org.online.server.entity.BasketEntity;
import org.online.server.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Basket {

    private Long id;
    private User user;
    private List<BasketDevice> basketDevice;


    public static Basket toModel(BasketEntity entity){
        Basket model = new Basket();
        model.setId(entity.getId());
        model.setUser(User.toModel(entity.getUser()));
        model.setBasketDevice(entity.getBasketDevice().stream().map(BasketDevice::toModel).collect(Collectors.toList()));

        return model;
    }

    public Basket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<BasketDevice> getBasketDevice() {
        return basketDevice;
    }

    public void setBasketDevice(List<BasketDevice> basketDevice) {
        this.basketDevice = basketDevice;
    }
}
