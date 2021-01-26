package com.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog implements LibrarySystem {

    private Map<String, List<BookItem>> titleMap=new HashMap<>();
    private Map<String, List<BookItem>> categoryMap=new HashMap<>();
    private Map<String, List<BookItem>> authorMap=new HashMap<>();

    public Catalog getCatalog(){
        if(this==null){
            return new Catalog(titleMap,categoryMap, authorMap);
        }
        else{
            return this;
        }
    }
    public Catalog(Map<String, List<BookItem>> titleMap, Map<String, List<BookItem>> categoryMap, Map<String, List<BookItem>> authorMap) {
        this.titleMap = titleMap;
        this.categoryMap = categoryMap;
        this.authorMap = authorMap;
    }

    public Map<String, List<BookItem>> getTitleMap() {
        return titleMap;
    }

    public void setTitleMap(Map<String, List<BookItem>> titleMap) {
        this.titleMap = titleMap;
    }

    public Map<String, List<BookItem>> getCategoryMap() {
        return categoryMap;
    }

    public void setCategoryMap(Map<String, List<BookItem>> categoryMap) {
        this.categoryMap = categoryMap;
    }

    public Map<String, List<BookItem>> getAuthorMap() {
        return authorMap;
    }

    public void setAuthorMap(Map<String, List<BookItem>> authorMap) {
        this.authorMap = authorMap;
    }

    @Override
    public List<BookItem> searchBookByTitle(String title) {
        List<BookItem> emptyList=new ArrayList<>();
        for(Map.Entry<String, List<BookItem>> entry: this.titleMap.entrySet()) {
            if (entry.getKey().equals(title)) {
                return entry.getValue();
            }
        }

        return emptyList;
    }

    @Override
    public List<BookItem> searchBookByAuthor(String author) {
        List<BookItem> emptyList=new ArrayList<>();
        for(Map.Entry<String, List<BookItem>> entry: this.authorMap.entrySet()) {
            if (entry.getKey().equals(author)) {
                return entry.getValue();
            }
        }

        return emptyList;

    }

    @Override
    public List<BookItem> searchBookByCategory(String category) {
        List<BookItem> emptyList=new ArrayList<>();
        for(Map.Entry<String, List<BookItem>> entry: this.categoryMap.entrySet()) {
            if (entry.getKey().equals(category)) {
                return entry.getValue();
            }
        }

        return emptyList;
    }
}
