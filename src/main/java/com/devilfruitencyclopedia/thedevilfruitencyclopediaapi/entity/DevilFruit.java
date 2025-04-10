package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "devil_fruits")
public class DevilFruit {

    @Id
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false)
    private DevilFruitType type;

    @Column(name = "current_holder", length = 50)
    private String currentHolder;

    @Column(columnDefinition = "TEXT")
    private String pastUsers;

    @Column(length = 255, nullable = false)
    private String description;

    @Column(length = 255, nullable = false)
    private String imageUrl;

    // Constructors
    public DevilFruit() {
    }

    public DevilFruit(String name, DevilFruitType type, String currentHolder, String pastUsers, String description, String imageUrl) {
        this.name = name;
        this.type = type;
        this.currentHolder = currentHolder;
        this.pastUsers = pastUsers;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    //Getters and Setters
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

    public DevilFruitType getType() {
        return type;
    }

    public void setType(DevilFruitType type) {
        this.type = type;
    }

    public String getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }

    public String getPastUsers() {
        return pastUsers;
    }

    public void setPastUsers(String pastUsers) {
        this.pastUsers = pastUsers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}