package com.suatylmz.librarymanagementsystem.entity.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long laptopId;

    private String laptopModel;

    private String laptopColor;

    private boolean isUsable;

    @ManyToMany(mappedBy = "borrowedLaptops")
    private Set<Student> laptopBorrowersStudent= new HashSet<>();

    @ManyToMany(mappedBy = "borrowedLaptops")
    private Set<Teacher> laptopBorrowersTeacher= new HashSet<>();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy-MM-dd")
    private LocalDate borrowedDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy-MM-dd")
    private LocalDate returnDate;




}
