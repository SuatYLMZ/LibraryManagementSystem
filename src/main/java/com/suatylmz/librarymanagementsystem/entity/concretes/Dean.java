package com.suatylmz.librarymanagementsystem.entity.concretes;

import com.suatylmz.librarymanagementsystem.entity.abstracts.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "deans")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Dean extends User {
}
