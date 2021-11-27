package com.example.productseller.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.productseller.model.Book;

public interface IBookRepository extends JpaRepository<Book, Long>{

}
