package com.epam.javaadvanced.cleanCode.Task1;

public class LoanManager {
    private BookRegistry bookRegistry;

    public LoanManager(BookRegistry bookRegistry) {
        this.bookRegistry = bookRegistry;
    }

    public String checkOutBook(String bookId, String userId) {
        if (bookRegistry.isBookAvailable(bookId)) {
            bookRegistry.leanBook(bookId, userId);
            return "Book successfully checked out to " + userId;
        }else {
            return "Book is not available";
        }
    }

    public String returnBook(String bookId) {
        if (bookRegistry.getLender(bookId) != null) {
            bookRegistry.returnBook(bookId);
            return "Book successfully returned";
        }else {
            return "This book was not checked out.";
        }
    }

}
