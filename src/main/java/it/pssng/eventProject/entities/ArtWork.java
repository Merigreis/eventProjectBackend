/**
 * File: ArtWork.java
 */

package it.pssng.eventProject.entities;

import jakarta.persistence.*;

/**
 * This is an entity bean. In a entity bean is declared all entity's attributes
 * and their getters and setters
 * Using the annotation @Entity we can use it as an entity bean in the Spring
 * Boot Framework
 */

@Entity
@Table(name = "artworks")
public class ArtWork {

    /**
     * The @Id annotation makes the attribute 'exhibitionCode' the primary key of
     * this entity
     * 
     * @GeneratedValue is an annotation that gives to exhibitionCode the property to
     *                 have a primary key with auto-increment.
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artwork_code")
    private Long exhibitionCode;
    @Column(name = "number_of_works")
    private int numberOfWorks = 0;
    @Column(name = "maximum_capacity")
    private int maximumCapacity = 0;
    @Column(name = "artwork_theme")
    private String artworkTheme;
    @Column(name = "description")
    private String description;
    @Column(name = "location")
    private Long location;
    @Column(name = "date_and_time")
    private String dateAndTime;

    /**
     * @OneToOne(cascade = CascadeType.ALL) //da rivedere
     * @JoinColumn(name="location",referencedColumnName = "location_id")
     *                                                  private Location
     *                                                  joinedLocation;
     **/
    // Getters and Setters
    public Long getExhibitionCode() {
        return exhibitionCode;
    }

    public int getNumberOfWorks() {
        return numberOfWorks;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getExhibitionTheme() {
        return artworkTheme;
    }

    public String getDescription() {
        return description;
    }

    public Long getLocation() {
        return location;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExhibitionCode(Long exhibitionCode) {
        this.exhibitionCode = exhibitionCode;
    }

    public void setExhibitionTheme(String artworkTheme) {
        this.artworkTheme = artworkTheme;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public void setNumberOfWorks(int numberOfWorks) {
        this.numberOfWorks = numberOfWorks;
    }
}
