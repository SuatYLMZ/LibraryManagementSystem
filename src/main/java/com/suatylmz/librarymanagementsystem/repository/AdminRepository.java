package com.suatylmz.librarymanagementsystem.repository;

import com.suatylmz.librarymanagementsystem.entity.concretes.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
