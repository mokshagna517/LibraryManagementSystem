package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Librarian {
public void addBookItem(BookItem bookItem, Map<String, List<BookItem>> titleMap, Map<String,List<BookItem>> authorMap, Map<String,List<BookItem>> categoryMap){
  if(titleMap.get(bookItem.getTitle())!=null){
      List<BookItem> l=titleMap.get(bookItem.getTitle());
      l.add(bookItem);
      return;
  }
  else{
      List<BookItem> l=new ArrayList<>();
      l.add(bookItem);
      titleMap.put(bookItem.getTitle(), l);
  }
  //Similarly for author map and category Map
}
public void removeBookItem(BookItem bookItem){
   //
}
public void updateBookItem(BookItem bookItem){
//
}

}
