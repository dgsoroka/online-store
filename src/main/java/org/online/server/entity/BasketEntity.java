package org.online.server.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "basket")
public class BasketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basketId")
    private List<BasketDeviceEntity> basketDevice;

    public BasketEntity() {
    }

    public List<BasketDeviceEntity> getBasketDevice() {
        return basketDevice;
    }

    public void setBasketDevice(List<BasketDeviceEntity> basketDevice) {
        this.basketDevice = basketDevice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

}
