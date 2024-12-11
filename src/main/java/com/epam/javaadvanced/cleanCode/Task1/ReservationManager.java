package com.epam.javaadvanced.cleanCode.Task1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ReservationManager {
    private HashMap<String, Queue<String>> reservations = new HashMap<>();

    public void reserveBook(String bookId, String userId) {
        reservations.computeIfAbsent(bookId, k -> new LinkedList<>()).add(userId);
    }

    public String getNextInQueue(String bookId) {
        Queue<String> queue = reservations.get(bookId);
        return (queue != null && !queue.isEmpty()) ? queue.poll() : null;
    }
}
