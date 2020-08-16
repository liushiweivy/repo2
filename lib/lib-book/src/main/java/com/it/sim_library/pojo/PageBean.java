package com.it.sim_library.pojo;

import java.util.List;

public class PageBean {
    private int curpage=1;//当前页数
    private int pageSize=5;//每页显示的记录数
    private long totalCount;//总记录数
    private long totalPage;//总页数

    public int getCurpage() {
        return curpage;
    }

    public void setCurpage(int curpage) {
        this.curpage = curpage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public PageBean(long totalCount, long totalPage ,List<Book> books) {
        this.totalCount = totalCount;
        this.totalPage=totalPage;
        this.books = books;
    }

    private List<Book> books;//每页的显示的数据
}
