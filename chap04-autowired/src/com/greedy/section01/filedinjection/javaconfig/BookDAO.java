package com.greedy.section01.filedinjection.javaconfig;

import java.util.List;

public interface BookDAO {
	List<BookDTO> selectBookList();
	
	BookDTO selectOneBook(int sequence);
}
