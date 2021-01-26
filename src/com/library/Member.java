package com.library;

import com.library.constants.BookStatus;

import javax.swing.text.DateFormatter;
import java.util.Date;

public class Member {
    private String membership_id;
    private String name;
    private int no_of_books_borrowed;
    public Member(String name, String membership_id){
        this.no_of_books_borrowed=0;
        this.name=name;
        this.membership_id=membership_id;
    }

    public String getMembership_id() {
        return membership_id;
    }

    public void setMembership_id(String membership_id) {
        this.membership_id = membership_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo_of_books_borrowed() {
        return no_of_books_borrowed;
    }

    public void setNo_of_books_lent(int no_of_books_borrowed) {
        this.no_of_books_borrowed = no_of_books_borrowed;
    }
    public boolean checkoutItem(BookItem bookItem){
        if(bookItem.getStatus()== BookStatus.AVAILABLE && this.no_of_books_borrowed<5){
            bookItem.setStatus(BookStatus.LOANED);
            this.no_of_books_borrowed+=1;
            return true;
        }
        else if(this.no_of_books_borrowed>=5){
            System.out.println("No of books exceeded max limit.Please return to borrow new books");
            return false;
        }
        else if(bookItem.getStatus()!=BookStatus.AVAILABLE){
            System.out.println("Book is not available..Please comeback later");
            return false;
        }
return false;
    }
    public boolean returnItem(BookItem bookItem){
        if(bookItem.getStatus()==BookStatus.AVAILABLE){
            System.out.println("Wrong bookItem returned..this is not taken by you");
            return false;
        }
        else if(bookItem.getStatus()==BookStatus.LOANED){
            bookItem.setStatus(BookStatus.AVAILABLE);
            this.no_of_books_borrowed-=1;
            return true;
        }
        return false;

    }
    public boolean renewItem(BookItem bookItem){
        if(bookItem.getStatus()==BookStatus.RESERVED){
            System.out.println("Book cannot be renewed as it is reserved already");
            bookItem.setStatus(BookStatus.AVAILABLE);
            this.no_of_books_borrowed-=1;
            return false;
        }
        else if(bookItem.getStatus()==BookStatus.LOANED){
            bookItem.setLentDate(new Date());
            return true;
        }
        return false;
    }
}
