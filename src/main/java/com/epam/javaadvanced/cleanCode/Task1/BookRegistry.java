package com.epam.javaadvanced.cleanCode.Task1;

import java.util.concurrent.ConcurrentHashMap;

public class BookRegistry {
    private ConcurrentHashMap<String, String> bookRegistry = new ConcurrentHashMap<>();

    public boolean isBookAvailable(String bookId) {
        return bookRegistry.containsKey(bookId);
    }

    public void leanBook(String bookId, String userId) {
        bookRegistry.put(bookId, userId);
    }

    public void returnBook(String bookId) {
        bookRegistry.remove(bookId);
    }

    public String getLender(String bookId) {
        return bookRegistry.get(bookId);
    }
}
