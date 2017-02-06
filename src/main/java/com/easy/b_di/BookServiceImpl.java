package com.easy.b_di;

public class BookServiceImpl implements BookService{
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	@Override
	public void addBook() {
		bookDao.save();
	}

}
