package com.sanid.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanid.entity.Author;


public interface AuthorRepository extends JpaRepository<Author, Serializable> {

	
}
