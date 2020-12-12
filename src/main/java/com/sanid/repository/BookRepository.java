package com.sanid.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanid.entity.Author;
import com.sanid.entity.BookEntity;


public interface BookRepository extends JpaRepository<BookEntity, Serializable> {

	
}
