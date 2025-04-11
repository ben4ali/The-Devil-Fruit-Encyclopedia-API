package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "devil_fruits")
public class DevilFruit {

    @Id
    private Long id;

    @Column(length = 50, nullable = false)
    private String originalName;

    @Column(length = 50, nullable = false)
    private String romanizedName;

    @Column(length = 50, nullable = false)
    private String englishName;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false)
    private DevilFruitType type;

    @Column(length = 50, nullable = false)
    private String debutChapter;

    @Column(length = 50, nullable = false)
    private String debutEpisode;

    @Column(length = 50, nullable = false)
    private String debutArc;

    @Column(name = "current_holder", length = 50)
    private String currentHolder;

    @Column(name = "past_holders", columnDefinition = "TEXT")
    private String pastHolders;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "awakening_status", nullable = false)
    private boolean awakeningStatus;

    @Column(columnDefinition = "TEXT")
    private String awakeningDescription;

    @Column(name = "is_canon", nullable = false)
    private boolean isCanon;

    @Column(length = 255, nullable = false)
    private String imageUrl;

    // Constructors
    public DevilFruit() {
    }

    public DevilFruit(String originalName, String romanizedName, String englishName, DevilFruitType type, String debutChapter, String debutEpisode, String debutArc, String currentHolder, String pastHolders, String description, boolean awakeningStatus, String awakeningDescription, boolean isCanon, String imageUrl) {
        this.originalName = originalName;
        this.romanizedName = romanizedName;
        this.englishName = englishName;
        this.type = type;
        this.debutChapter = debutChapter;
        this.debutEpisode = debutEpisode;
        this.debutArc = debutArc;
        this.currentHolder = currentHolder;
        this.pastHolders = pastHolders;
        this.description = description;
        this.awakeningStatus = awakeningStatus;
        this.awakeningDescription = awakeningDescription;
        this.isCanon = isCanon;
        this.imageUrl = imageUrl;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getRomanizedName() {
        return romanizedName;
    }

    public void setRomanizedName(String romanizedName) {
        this.romanizedName = romanizedName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public DevilFruitType getType() {
        return type;
    }

    public void setType(DevilFruitType type) {
        this.type = type;
    }

    public String getDebutChapter() {
        return debutChapter;
    }

    public void setDebutChapter(String debutChapter) {
        this.debutChapter = debutChapter;
    }

    public String getDebutEpisode() {
        return debutEpisode;
    }

    public void setDebutEpisode(String debutEpisode) {
        this.debutEpisode = debutEpisode;
    }

    public String getDebutArc() {
        return debutArc;
    }

    public void setDebutArc(String debutArc) {
        this.debutArc = debutArc;
    }

    public String getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }

    public String getPastHolders() {
        return pastHolders;
    }

    public void setPastHolders(String pastHolders) {
        this.pastHolders = pastHolders;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAwakeningStatus() {
        return awakeningStatus;
    }

    public void setAwakeningStatus(boolean awakeningStatus) {
        this.awakeningStatus = awakeningStatus;
    }

    public String getAwakeningDescription() {
        return awakeningDescription;
    }

    public void setAwakeningDescription(String awakeningDescription) {
        this.awakeningDescription = awakeningDescription;
    }

    public boolean isCanon() {
        return isCanon;
    }

    public void setCanon(boolean canon) {
        isCanon = canon;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // toString
    @Override
    public String toString() {
        return "DevilFruit{" +
                "id=" + id +
                ", originalName='" + originalName + '\'' +
                ", romanizedName='" + romanizedName + '\'' +
                ", englishName='" + englishName + '\'' +
                ", type=" + type +
                ", debutChapter='" + debutChapter + '\'' +
                ", debutEpisode='" + debutEpisode + '\'' +
                ", debutArc='" + debutArc + '\'' +
                ", currentHolder='" + currentHolder + '\'' +
                ", pastHolders='" + pastHolders + '\'' +
                ", description='" + description + '\'' +
                ", awakeningStatus=" + awakeningStatus +
                ", awakeningDescription='" + awakeningDescription + '\'' +
                ", isCanon=" + isCanon +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}