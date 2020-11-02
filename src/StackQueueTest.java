import java.util.*;

public class StackQueueTest {
    public static void main(String[] args) {
        Stack<String> stackTest=new Stack<>();
        stackTest.push("shit1");
        stackTest.push("shit2");
        stackTest.push("shit3");
        stackTest.push("shit4");
        System.out.println(stackTest);
        stackTest.pop();
        System.out.println(stackTest);

        Queue<String> pq = new PriorityQueue<>();
        pq.add("queue1");
        pq.add("queue2");
        pq.add("queue3");
        pq.add("queue4");
        pq.add("queue5");
        pq.add("queue6");
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
        pq.add("queue1");
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.element());

//        List<String> lkl = new LinkedList<>();
        LinkedList<String> lkl = new LinkedList<String>();
        lkl.add("queue1");
        lkl.add("queue2");
        lkl.add("queue3");
        lkl.add("queue4");
        lkl.add("queue5");
        lkl.add("queue6");
        System.out.println(lkl);
        System.out.println(lkl.peek());
        lkl.poll();
        System.out.println(lkl);
        lkl.addFirst("queue1");
        System.out.println(lkl);

//        lkl.add("queue1");
//        System.out.println(lkl.peek());
//        System.out.println(lkl.poll());
//        System.out.println(lkl);
    }
}
