package samer.Heaps;

import java.util.PriorityQueue;

public class Heap {

    PriorityQueue<Integer> pq;

    public Heap() {
        pq = new PriorityQueue<>();
    }

    // Most common methods used with PriorityQueue
    public void listPriorityQueueMethods() {
        // Add element - O(log_n)
        pq.add(1);

        // Get root element of PQ - O(1)
        pq.peek();

        // Return true if PQ is empty, otherwise return false - O(1)
        pq.isEmpty();

        // Remove (and return) root element of PQ - O(log_n)
        pq.poll();

        // Remove element - O(n)
        pq.remove(1);
    }

}
