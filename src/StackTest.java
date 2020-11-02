import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackTest {
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
    }
}
