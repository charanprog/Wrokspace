package Collectiom;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(23);
        queue.add(253);
        queue.add(93);
        queue.add(89);
        queue.add(908);
        queue.offer(34);
        queue.element();
//        queue.peek();
//        queue.remove(344);
//        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
    }
}