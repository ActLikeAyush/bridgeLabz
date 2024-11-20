package collection;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String args[]){




        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(22);
        pq.add(15);
        pq.add(12);
        pq.add(2);
        pq.add(25);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        pq.remove(25);
        System.out.println(pq);
        pq.offer(25);
        System.out.println(pq);

    }
}
