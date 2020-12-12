package com.sanid.response;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import com.sanid.entity.BookEntity;

import lombok.Data;

@Data
@XmlRootElement
public class Author {

	private int AuthorId;

	private String fname;

	private String lname;

	private String email;

	private String uname;

	private String mno;

	private String addr1;

	private String addr2;

	public int getAuthorId() {
		return AuthorId;
	}

	public void setAuthorId(int authorId) {
		AuthorId = authorId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

}
