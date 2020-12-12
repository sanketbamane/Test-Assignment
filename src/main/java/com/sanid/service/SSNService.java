package com.sanid.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sanid.entity.Author;





public interface SSNService {

	public Author findByssnid(int ssnid);

	public void deleteById(int id);

	Page<Author> findAll(Pageable pageable);

	public int saveAuthor(Author author);

}