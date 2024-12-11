package com.epam.javaadvanced.cleanCode.Task1;

public class LibrarySystem {
    private BookRegistry bookRegistry = new BookRegistry();
    private LoanManager loanManager = new LoanManager(bookRegistry);
    private ReservationManager reservationManager = new ReservationManager();

    public void checkOutBook(String bookId, String userId) {
        System.out.println(loanManager.checkOutBook(bookId, userId));
    }

    public void returnBook(String bookId) {
        System.out.println(loanManager.returnBook(bookId));
        String nextUser = reservationManager.getNextInQueue(bookId);
        if (nextUser != null) {
            System.out.println("Notifying next user in queue " + nextUser);
        }
    }

    public void reserveBook(String bookId, String userId) {
        reservationManager.reserveBook(bookId, userId);
        System.out.println("Reservation added for user " + userId);
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.checkOutBook("BK001", "USR001");
        library.reserveBook("BK001", "USR002");
        library.returnBook("BK001");
    }
}
