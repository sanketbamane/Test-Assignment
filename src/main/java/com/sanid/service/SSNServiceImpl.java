package com.sanid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sanid.entity.Author;
import com.sanid.repository.AuthorRepository;




//import com.sanid.pojo.SSNEnroll;

@Service
public class SSNServiceImpl implements SSNService {

	@Autowired
	private AuthorRepository repo;
	
	@Override
	public int saveAuthor(Author author) {
		// TODO Auto-generated method stub

		Author entity = new Author();
		BeanUtils.copyProperties(author, entity);
		
		Author savedEntity = repo.save(entity);
		int sId = savedEntity.getAuthorId();
		
		
		return sId;
	}

	@Override
	public Author findByssnid(int ssn) {
		// TODO Auto-generated method stub
		Optional<Author> optional = repo.findById(ssn);
		Author ssnv = new Author();
		if(optional.isPresent()) {
			Author	 entity = optional.get();
			Author c= new Author();
			BeanUtils.copyProperties(entity, c);
			ssnv=c;
		}
		
		return ssnv;
	}

	/*
	 * @Override public List<SSNEnrollEntity> findAll() { // TODO Auto-generated
	 * method stub
	 * 
	 * return repo.findAll(); }
	 */
	
	@Override
	public Page<Author> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		
		return repo.findAll(pageable);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}