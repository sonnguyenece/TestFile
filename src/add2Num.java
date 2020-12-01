import java.util.List;

public class add2Num {
    public static void main(String[] args) {

        ListNode l11 = new ListNode();
        ListNode l12 = new ListNode();
        ListNode l13 = new ListNode();
        l11.setVal(2);
        l12.setVal(4);
        l13.setVal(3);
        l11.setNext(l12);
        l12.setNext(l13);

        ListNode l21 = new ListNode();
        ListNode l22 = new ListNode();
        ListNode l23 = new ListNode();
        l21.setVal(5);
        l22.setVal(6);
        l23.setVal(4);
        l21.setNext(l22);
        l22.setNext(l23);

        addTwoNumbers(l11, l21);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();
        StringBuilder sum3 = new StringBuilder();
        do {
            sum1.append(l1.val);
            l1 = l1.next;
        } while (l1 != null);
        sum1.reverse();
        do {
            sum2.append(l2.val);
            l2 = l2.next;
        } while (l2 != null);
        sum2.reverse();

        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);

        int sumInt3 = Integer.parseInt(String.valueOf(sum1)) + Integer.parseInt(String.valueOf(sum2));
        System.out.println(sumInt3);
        sum3.append(String.valueOf(sumInt3));
        sum3.reverse();
        System.out.println(sum3);

        int temp = 0;
        l3 = createResult(sum3, temp);
        System.out.println(l3.val);
        System.out.println(l3.next.val);
        System.out.println(l3.next.next.val);

        return l3;
    }

    private static ListNode createResult(StringBuilder sum3, int temp) {
        ListNode listNode = new ListNode();
        listNode.setVal(Integer.parseInt(sum3.charAt(temp) + ""));
        temp++;
        if (temp >= sum3.length()) return listNode;
        listNode.setNext(createResult(sum3, temp));
        return listNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
