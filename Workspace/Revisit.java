import java.util.ArrayList;
import java.util.Stack;

class Churning {

    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty()
    {
        return list.size() == 0;
    }

    public static void push(int data) {
        list.add(data);
    }

    public static int pop() {
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        return top;
    }

    public int peek() {
        if (isEmpty())
        {
            return -1;
        }

        return list.get(list.size() - 1);
    }

    public void PushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    public String ReverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;

        while (index < str.length())
        {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty())
        {
            char curr = s.pop();
            sb.append(curr);
        }

        return sb.toString();
    }

    public void reverseStack(Stack<Integer> s) {

        if (s.isEmpty())
        {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        PushAtBottom(s, top);
    }

    
}

class Queue {
    static int[] arr;
    static int size;
    static int rear;

    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void add(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Housefull....");
            return;
        }

        rear = rear + 1;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty....");
            return -1;
        }

        int front = arr[0];
        for (int i = 0; i < rear; i++)
        {
            arr[i] = arr[i+1];
        }
        rear = rear - 1;

        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty....");
            return -1;
        }

        return arr[0];
    }
}

public class Revisit {
    
    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.add(2);
        q.add(4);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
