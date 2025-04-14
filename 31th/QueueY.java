import java.util.*;

public class QueueY {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.pop();
        }
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }
    }

    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // next = null;
    // }
    // }

    // static class Queue {

    // static Node head = null;
    // static Node tail = null;

    // public boolean isEmpty() {
    // return head == null && tail == null;
    // }

    // // Enqueue (Add) -- O(1)
    // public void add(int data) {
    // Node newNode = new Node(data);
    // if (tail == null) {
    // tail = head = newNode;
    // }
    // tail.next = newNode;
    // tail = newNode;
    // }

    // // Dequeue (Remove) -- O(1)
    // public int remove() {
    // if (isEmpty()) {
    // System.out.println("Empty queue");
    // return -1;
    // }
    // int front = head.data;
    // if(head == tail){
    // tail = null;
    // }
    // head = head.next;

    // return front;
    // }

    // // Peek
    // public int peek() {
    // if (isEmpty()) {
    // System.out.println("Empty queue");
    // return -1;
    // }
    // return head.data;
    // }
    // }

    public static void main(String[] args) {
        // Queue q = new Queue(); // Fix: Provide size during instantiation
        // Queue<Integer> q = new LinkedList<>();
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // for queue 1 2 3.... for stack 3 2 1
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
