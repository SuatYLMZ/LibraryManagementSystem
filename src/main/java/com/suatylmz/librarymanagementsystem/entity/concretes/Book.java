package com.suatylmz.librarymanagementsystem.entity.concretes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private Long totalPages;

    private String author;

    private String description;

    private Long availableCopies;

    @ManyToMany(mappedBy = "borrowedBooks")
    private Set<Student> bookBorrowers= new HashSet<>();

    @ManyToMany(mappedBy = "borrowedBooks")
    private Set<Student> laptopBorrowers= new HashSet<>();




}
