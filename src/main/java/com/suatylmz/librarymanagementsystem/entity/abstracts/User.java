package com.suatylmz.librarymanagementsystem.entity.abstracts;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.suatylmz.librarymanagementsystem.entity.concretes.Book;
import com.suatylmz.librarymanagementsystem.entity.concretes.Laptop;
import com.suatylmz.librarymanagementsystem.entity.concretes.UserRole;
import com.suatylmz.librarymanagementsystem.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String name;

    private String surname;

    @Column(unique = true)
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UserRole userRole;

    private Gender gender;

    @ManyToMany
    @JoinTable(
            name = "user_books",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<Book> borrowedBooks = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "user_laptops",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "laptop_id")
    )
    private Set<Laptop> borrowedLaptops = new HashSet<>();
}
