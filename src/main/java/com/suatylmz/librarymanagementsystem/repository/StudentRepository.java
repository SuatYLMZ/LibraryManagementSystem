package com.suatylmz.librarymanagementsystem.repository;

import com.suatylmz.librarymanagementsystem.entity.concretes.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
