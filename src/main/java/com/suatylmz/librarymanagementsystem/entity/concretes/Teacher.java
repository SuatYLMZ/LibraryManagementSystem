package com.suatylmz.librarymanagementsystem.entity.concretes;

import com.suatylmz.librarymanagementsystem.entity.abstracts.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Teacher extends User {

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.REMOVE)
    private List<Student> studentInfos;
}
