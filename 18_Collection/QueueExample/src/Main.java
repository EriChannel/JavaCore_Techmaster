
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> linkedList = new LinkedList<>();
//        linkedList.add(4);
//        linkedList.add(9);
//        linkedList.offer(1);
//        linkedList.offer(7);
//
//        System.out.println(linkedList);
//
//        //System.out.println(linkedList.element());
//        //System.out.println(linkedList.peek());
//
//        System.out.println(linkedList.poll());
//
//        System.out.println(linkedList);

//        Queue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(67);
//        priorityQueue.add(14);
//        priorityQueue.offer(91);
//        priorityQueue.offer(4);
//
//        System.out.println(priorityQueue);
//
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(9);
        deque.add(3);
        deque.add(1);

        System.out.println(deque);

        deque.addFirst(0);
        deque.addLast(20);

        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);

    }
}