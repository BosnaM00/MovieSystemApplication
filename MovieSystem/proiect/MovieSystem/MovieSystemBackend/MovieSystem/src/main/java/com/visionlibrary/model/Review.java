package com.visionlibrary.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String reviewerFirstName;

    @Column(nullable = false)
    private String reviewerLastName;

    @Column
    private String description;

    private String reviewCode;

    @ManyToOne
    @JsonBackReference

    private Movie Movie;


    public void setReviewDescription(String description) {
        if (description != null && description.isEmpty()) {
            description = null;
        }
        this.description = description;
    }



}
