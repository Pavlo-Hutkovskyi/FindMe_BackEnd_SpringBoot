package com.findme.backend.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "advert")
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "publication_date")
    private LocalDate publicationDate;
    @Column(name = "is_advert_about_need")
    private boolean isAdvertAboutNeed;
    @Column(name = "is_urgent")
    private boolean isUrgent;
    @Column(name = "is_matched")
    private boolean isMatched;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "help_type_id")
    private int helpTypeId;

    public Advert() {
    }

    public Advert(String description, LocalDate publicationDate, boolean isAdvertAboutNeed, boolean isUrgent, boolean isMatched, int userId, int helpTypeId) {
        this.description = description;
        this.publicationDate = publicationDate;
        this.isAdvertAboutNeed = isAdvertAboutNeed;
        this.isUrgent = isUrgent;
        this.isMatched = isMatched;
        this.userId = userId;
        this.helpTypeId = helpTypeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isAdvertAboutNeed() {
        return isAdvertAboutNeed;
    }

    public void setAdvertAboutNeed(boolean advertAboutNeed) {
        isAdvertAboutNeed = advertAboutNeed;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHelpTypeId() {
        return helpTypeId;
    }

    public void setHelpTypeId(int helpTypeId) {
        this.helpTypeId = helpTypeId;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", publicationDate=" + publicationDate +
                ", isAdvertAboutNeed=" + isAdvertAboutNeed +
                ", isUrgent=" + isUrgent +
                ", isMatched=" + isMatched +
                ", userId=" + userId +
                ", helpTypeId=" + helpTypeId +
                '}';
    }
}
