package collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> lq=new LinkedList<>();
        lq.offer(22);
        lq.add(10);
        lq.offer(15);
        lq.add(19);

        System.out.println(lq);

        System.out.println(lq.peek());
        System.out.println(lq.poll());
        System.out.println(lq);

    }
}
