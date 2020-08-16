package com.it.sim_library.dao;

import com.it.sim_library.pojo.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    @Select("select * from book")
    List<Book> findBooks(int curpage,int size);

    @Insert("insert into book (name,category) values (#{name},#{category})")
    int addBook(Book book);

    @Update("delete from book where id=#{id}")
    int delBook(int id);

    @Select("select * from book where id=#{id}")
    Book findById(int id);

    @Update("update book set name=#{name},category=#{category} where id=#{id}")
    int updateBook(Book book);
}
