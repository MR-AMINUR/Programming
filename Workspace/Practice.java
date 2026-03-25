import java.util.*;


class Computer {

    public void playNasheed() {
        System.out.println("Wedding Nasheed....");
    }
    
}

class Mobile {

    String brand;
    int price;
    static String name;

    public void show() {

        System.out.println(brand + " : " + price + " : " + name);
    }
}

class Human {

    public int age;
    public String name ;

    public Human() {
        System.out.println("In a haram friendship!");
    }

    public int getAge() {

        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class A {

    public void show() {
        System.out.println("In A");
    }
    public void config() {
        System.out.println("In configuration");
    }
}

class B extends A {

    public void show() {
        System.out.println("In B");
    }
}

class Laptop {

    String model;
    int price;

    public String toString() {

        return model + " : " + price;
    }

    public boolean equals(Laptop that) {

        return this.model.equals(that.model) && this.price ==that.price;
    }
}

/* 

class SubQuadratic {

    public int ArrayElement(Integer[] a, Integer[] b) {

        int size = a.length;
        int count = 0;

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                if (a[i] == b[j])
                    count++;
        }

        return count;
    }
}

class ArraySum {

    public int solve (Integer[] a) {

        int N = a.length;
        int B = 0;

        if (B == N)
            return sum(a);
        return B;

    }

    private int sum(Integer[] a) {
        Integer sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }
}
*/

class C implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data)
    {
        this.data = data;
        //this.next = next;
        //this.prev = prev;
    }
}

class Revisit {

    public Node head;
    public Node tail;
    public int size;

    public void print() {

        Node temp = head;

        if (head == null)
        {
            System.out.println("The linked List is empty");
            return;
        }

        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int index, int data) {
        if (index == 0)
        {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index-1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int remove() {
        if (size == 0)
        {
            System.out.println("The list is empty to remove anything.");
            return Integer.MIN_VALUE;
        }
        else if (size == 1)
        {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;

        return value;
    }


    /*---------------Stack Implementation------------------- */

    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {

        return head == null;
    }

    public void push(int data) {
        
        Node newNode = new Node(data);

        if (isEmpty()) {

            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {

        if (isEmpty()) {

            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty())
        {
            return -1;
        }
        return head.data;
    }

    public void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public void printStack(Stack<Integer> s) {

        while (! s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }

    public String revString(String str) {

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
        pushAtBottom(s, top);
    }

}

public class Practice {

    public static void main(String[] args) throws ClassNotFoundException {
     
    Scanner sc = new Scanner(System.in);
    Stack<Integer> s = new Stack<>();
    Revisit rv = new Revisit();

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    
    rv.reverseStack(s);
    rv.printStack(s);

    
        
    sc.close();

    }
}