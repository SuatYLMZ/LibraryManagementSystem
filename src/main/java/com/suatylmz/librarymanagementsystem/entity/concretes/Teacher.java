package com.suatylmz.librarymanagementsystem.entity.concretes;

import com.suatylmz.librarymanagementsystem.entity.abstracts.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Teacher extends User {
}
