package com.library;

import java.util.List;

public interface LibrarySystem {
    public List<BookItem> searchBookByTitle(String title);
    public List<BookItem> searchBookByAuthor(String author);
    public List<BookItem> searchBookByCategory(String category);
}
