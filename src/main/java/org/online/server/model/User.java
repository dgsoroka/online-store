package org.online.server.model;

import org.online.server.entity.BasketEntity;
import org.online.server.entity.RatingEntity;
import org.online.server.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class User {

    private Long id;
    private String email;
    private String role;
    private Basket basket;
    private List<Rating> ratings;


    public static User toModel(UserEntity entity){
        User model = new User();
        model.setId(entity.getId());
        model.setEmail(entity.getEmail());
        model.setRole(entity.getRole());
        model.setBasket(Basket.toModel(entity.getBasket()));
        model.setRatings(entity.getRatings().stream().map(Rating::toModel).collect(Collectors.toList()));

        return model;
    }

    public User() {
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
