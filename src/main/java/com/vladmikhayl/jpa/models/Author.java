package com.vladmikhayl.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

//import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {

    // @Id
    // @GeneratedValue
    /*@GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )*/
    /*@SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )*/
    // private Integer id;

    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private int age;

//    @Column(
//            updatable = false,
//            nullable = false
//    )
//    private LocalDateTime createdAt;
//
//    @Column(
//            insertable = false
//    )
//    private LocalDateTime lastModifiedAt;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
