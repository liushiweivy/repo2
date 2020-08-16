package com.it.sim_library.web;


import com.github.pagehelper.PageInfo;
import com.it.sim_library.pojo.Book;
import com.it.sim_library.pojo.PageBean;
import com.it.sim_library.service.BookService;
import com.sun.deploy.net.HttpResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("book")
@Api
public class Controller {

    @Autowired
    private BookService bookService;
    @RequestMapping(value = "bookList")
    public  String findAllBooks(Model model, @RequestParam(value = "curpage", defaultValue = "1") Integer curpage,
                                @RequestParam(value = "size", defaultValue = "5") Integer size){


       PageBean page = bookService.findAllBooks(curpage,size);
        if ((page==null||page.getBooks().size()==0)) {
            System.out.println("没有找到书");
        }

        model.addAttribute("page", page);
        return "books";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public  String addBook(Book book){


        boolean b = bookService.addBooks(book);
        if (!b) {
            System.out.println("新增失败");
        }
       return  "redirect:http://localhost:8081/book/bookList";
    }
    @GetMapping("delete")
    public  String findAllBooks(@RequestParam int id){


        boolean b = bookService.delBook(id);
        if (!b) {
            System.out.println("删除失败");
        }
        return  "redirect:http://localhost:8081/book/bookList";
    }

    @GetMapping("/update")
    public  String updateBook(Book book){
if (book==null){
    System.out.println("传参失败");
}

        System.out.println(book.getName());

        boolean b = bookService.updateBooks(book);
        if (!b) {
            System.out.println("更新失败");
        }
        return  "redirect:http://localhost:8081/book/bookList";
    }
    @GetMapping(value = "/findById")
    public  String findById(Model model,@RequestParam int id){

       Book book = bookService.findById(id);
        if (book==null) {
            System.out.println("查询失败");
        }
        System.out.println(book.getName()+"查询");
        model.addAttribute("book", book);
        return  "update";
    }
}
