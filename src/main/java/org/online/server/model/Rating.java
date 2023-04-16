package org.online.server.model;

import org.online.server.entity.DeviceEntity;
import org.online.server.entity.RatingEntity;
import org.online.server.entity.UserEntity;

public class Rating {

    private Long id;
    private User user;
    private Device device;
    private Integer rate;


    public static Rating toModel(RatingEntity entity){
        Rating model = new Rating();
        model.setId(entity.getId());
        model.setUser(User.toModel(entity.getUser()));
        model.setDevice(Device.toModel(entity.getDevice()));
        model.setRate(entity.getRate());

        return model;
    }

    public Rating() {
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

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
