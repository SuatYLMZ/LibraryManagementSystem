package com.suatylmz.librarymanagementsystem.repository;

import com.suatylmz.librarymanagementsystem.entity.concretes.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
