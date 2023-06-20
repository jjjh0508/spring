package com.greedy.section01.filedinjection.javaconfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{
	private Map<Integer,BookDTO> bookList;

	
	public BookDAOImpl() {
		bookList = new HashMap();
		bookList.put(1, new BookDTO(1,1234,"자바의정석","남궁성","도우출판",new java.util.Date()));
		bookList.put(2, new BookDTO(1,1234,"오라클의정석","님궁성","피자출판",new java.util.Date()));
		bookList.put(3, new BookDTO(1,1234,"스프링의정석","여궁성","너구리출판",new java.util.Date()));
	
	}
	@Override
	public List<BookDTO> selectBookList() {
		
		return new ArrayList<BookDTO>(bookList.values());
	}
    
	@Override
	public BookDTO selectOneBook(int sequence) {
		
		return bookList.get(sequence);
	}
	
	
}
