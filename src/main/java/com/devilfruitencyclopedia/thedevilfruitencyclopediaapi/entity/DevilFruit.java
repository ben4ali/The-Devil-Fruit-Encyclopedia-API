package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity;

import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.util.PastHoldersConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "devil_fruits")
public class DevilFruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("originalName")
    @Column(nullable = false)
    private String originalName;

    @JsonProperty("romanizedName")
    @Column(nullable = false)
    private String romanizedName;

    @JsonProperty("englishName")
    @Column(nullable = false)
    private String englishName;

    @JsonProperty("meaning")
    @Column(nullable = false)
    private String meaning;

    @JsonProperty("type")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DevilFruitType type;

    @JsonProperty("debutChapter")
    private String debutChapter;

    @JsonProperty("debutEpisode")
    private String debutEpisode;

    @JsonProperty("debutArc")
    private String debutArc;

    @JsonProperty("currentHolder")
    @Column(name = "current_holder")
    private String currentHolder;

    @JsonProperty("pastHolders")
    @Column(columnDefinition = "TEXT")
    @Convert(converter = PastHoldersConverter.class)
    private List<String> pastHolders;

    @JsonProperty("description")
    @Column(columnDefinition = "TEXT")
    private String description;

    @JsonProperty("awakeningStatus")
    @Column(name = "awakening_status", nullable = false)
    private boolean awakeningStatus;

    @JsonProperty("awakeningDescription")
    @Column(columnDefinition = "TEXT")
    private String awakeningDescription;

    @JsonProperty("isCanon")
    @Column(name = "is_canon", nullable = false)
    private boolean isCanon;

    @JsonProperty("imageUrl")
    @Column(length = 1024, nullable = false)
    private String imageUrl;

    // Constructors, Getters, and Setters

    public DevilFruit() {
    }

    public DevilFruit(String originalName, String romanizedName, String englishName, String meaning, DevilFruitType type,
                      String debutChapter, String debutEpisode, String debutArc, String currentHolder, List<String> pastHolders,
                      String description, boolean awakeningStatus, String awakeningDescription, boolean isCanon, String imageUrl) {
        this.originalName = originalName;
        this.romanizedName = romanizedName;
        this.englishName = englishName;
        this.meaning = meaning;
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

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
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

    public List<String> getPastHolders() {
        return pastHolders;
    }

    public void setPastHolders(List<String> pastHolders) {
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
                ", pastHolders=" + pastHolders +
                ", description='" + description + '\'' +
                ", awakeningStatus=" + awakeningStatus +
                ", awakeningDescription='" + awakeningDescription + '\'' +
                ", isCanon=" + isCanon +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}