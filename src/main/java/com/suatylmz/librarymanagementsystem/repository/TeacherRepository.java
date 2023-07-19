package com.suatylmz.librarymanagementsystem.repository;

import com.suatylmz.librarymanagementsystem.entity.concretes.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
