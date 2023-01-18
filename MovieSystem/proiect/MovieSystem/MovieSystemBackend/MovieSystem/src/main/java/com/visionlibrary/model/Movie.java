package com.visionlibrary.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.visionlibrary.model.enums.Category;
import com.visionlibrary.model.enums.Language;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    //@Column(nullable = false)
    private String title;

    //@Column(nullable = false)
    private String author;

    @Column
    private String publishingHouse;

    @Column
    private String collection;

    //@Column(nullable = false)
    private boolean available;

    //@Column(nullable = false)
    private Language language;

    //@Column(nullable = false)
    private int numberOfPages;

    @Column
    private int yearOfLaunch;

    //@Column(nullable = false)
    private Category category;

    //@Column(nullable = false)
//    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "moviecode")
    private String MovieCode;

    private String description;

    @Column(nullable = true)
    private String uploadedFileName;

    @OneToMany(mappedBy = "Movie") //, fetch = FetchType.EAGER , LAZY ?
    @JsonManagedReference
    private List<Review> reviews = new ArrayList<>();

}
