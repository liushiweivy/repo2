package com.it.sim_library.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.sim_library.dao.BookDao;
import com.it.sim_library.pojo.Book;
import com.it.sim_library.pojo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
@Autowired
private BookDao bookDao;
    public PageBean findAllBooks(int curpage,int size) {

        PageHelper.startPage(curpage, size);
        List<Book> books = bookDao.findBooks( curpage, size);
        PageInfo<Book> bookPageInfo = new PageInfo<>(books);

        return  new PageBean(bookPageInfo.getTotal(),bookPageInfo.getPages(),books);
    }

    public boolean addBooks(Book book) {

        int i = bookDao.addBook(book);
        if (i==1)return true;
        return false;
    }

    public boolean delBook(int id) {
        int i = bookDao.delBook(id);
        if (i==1)return true;
        return false;
    }

    public Book findById(int id) {
        Book book = bookDao.findById(id);
        return book;
    }

    public boolean updateBooks(Book book) {
        int i = bookDao.updateBook(book);
        if (i==1)return true;
        return false;
    }
}
