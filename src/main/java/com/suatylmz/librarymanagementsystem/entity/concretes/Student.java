package com.suatylmz.librarymanagementsystem.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.suatylmz.librarymanagementsystem.entity.abstracts.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Student extends User {

    @ManyToOne
    @JsonIgnoreProperties("teacher")
    private Teacher teacher;
}
