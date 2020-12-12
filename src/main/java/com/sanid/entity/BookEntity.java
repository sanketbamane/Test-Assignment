package com.sanid.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "ssn_book")
public class BookEntity {

	
	
	@Id
	@Column(name = "bookid")

	@GeneratedValue(strategy = GenerationType.AUTO)

	private int BookId;
	@Column(name = "book_name")
	private String bname;
	@Column(name = "book_price")
	private String bprice;	
	@Column(name = "currency")
	private String currency;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "authorid")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Author author;

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBprice() {
		return bprice;
	}

	public void setBprice(String bprice) {
		this.bprice = bprice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
}
