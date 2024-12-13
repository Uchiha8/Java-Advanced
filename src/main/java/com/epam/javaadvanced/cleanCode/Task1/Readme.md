# Library Management System

## Overview
This Library Management System demonstrates a refactored design to optimize and re-architect the book lending process. The solution adheres to SOLID principles and uses clean code practices to ensure maintainability, scalability, and robustness.

---

## Features
1. **Book Lending:** Enables users to check out and return books.
2. **Book Reservations:** Allows users to reserve books that are currently checked out.
3. **Thread-Safe Book Management:** Ensures concurrent access to the book registry is handled safely.
4. **User Notifications:** Notifies the next user in the reservation queue when a book is returned.

---

## Key Components

### 1. **BookRegistry**
- Manages storage and retrieval of book data.
- Ensures thread safety using a `ConcurrentHashMap`.
- Methods:
    - `isBookAvailable(String bookId)`: Checks if a book is available.
    - `lendBook(String bookId, String userId)`: Records a book as checked out.
    - `returnBook(String bookId)`: Marks a book as returned.
    - `getLender(String bookId)`: Retrieves the user who borrowed a book.

### 2. **LoanManager**
- Manages the book lending process.
- Methods:
    - `checkOutBook(String bookId, String userId)`: Allows a user to check out a book.
    - `returnBook(String bookId)`: Processes the return of a book.

### 3. **ReservationManager**
- Handles reservations for books.
- Methods:
    - `reserveBook(String bookId, String userId)`: Adds a user to the reservation queue.
    - `getNextInQueue(String bookId)`: Retrieves the next user in the reservation queue.

### 4. **LibrarySystem**
- Coordinates interactions between `BookRegistry`, `LoanManager`, and `ReservationManager`.
- Methods:
    - `checkOutBook(String bookId, String userId)`: Facilitates book checkouts.
    - `returnBook(String bookId)`: Handles book returns and notifies users in the reservation queue.
    - `reserveBook(String bookId, String userId)`: Adds a reservation for a book.

---
