package com.library;

import com.library.constants.BookStatus;

import java.util.Date;

public class BookItem extends Book {
   private String bookId;
   private BookStatus status;
   private Date lentDate;

    public int getRackNo() {
        return rackNo;
    }

    public void setRackNo(int rackNo) {
        this.rackNo = rackNo;
    }

    private Date returnDate;
   private int rackNo;

    public Date getLentDate() {
        return lentDate;
    }

    public void setLentDate(Date lentDate) {
        this.lentDate = lentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public BookItem(String ISBN, String title, String author, String id, BookStatus status, Date lentDate){
       super(ISBN,title,author);
       this.bookId=id;
       this.status=status;
       this.lentDate=null;
   }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
