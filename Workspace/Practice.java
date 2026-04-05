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

    public void StockSpan(int[] stock, int[] span) {

        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++)
        {
            int currPrice = stock[i];

            while (!s.isEmpty() && currPrice > stock[s.peek()])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                span[i] =  i+1;
            }
            else 
            {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
                s.push(i);
            }
        }
    }

    

    public boolean isSafe(int[][] maze, int x, int y) {

        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {

        if (x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1)
        {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y) == true)
        {
            if (sol[x][y] == 1)
            {
                return false;
            }
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x+1, y, sol))
            {
                return true;
            }
            if (solveMazeUtil(maze, x, y+1, sol))
            {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public void nextGreater(int[] arr) {

        Stack<Integer> s = new Stack<>();

        int[] nextgtr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--)
        {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                nextgtr[i] = -1;
            }
            else
            {
                nextgtr[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for (int i = 0; i < nextgtr.length; i++)
        {
            System.out.print(nextgtr[i]+ " ");
        }
        System.out.println();
    }

    public boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == ')')
            {
                int count = 0; 
                while (s.peek() != '(')
                {
                    s.pop();
                    count++;
                }
                if (count < 1)
                {
                    return true;
                }
                else
                {
                    s.pop();
                }
            }
            else
            {
                s.push(ch);
            }
        }

        return false;
    }

    static int N = 8;

    public boolean isSafe(int x, int y, int[][] sol) {

        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    public void printSolution(int[][] sol) {

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(sol[i][j] + " ");
            }

            System.out.println();
        }
    }

    public boolean solveKT() {
        int[][] sol = new int[8][8];

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                sol[i][j] = -1;
            }
        }

        int[] iMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] jMove = {1, 2, 2, 1, -1, -2, -2, -1};

        sol[0][0] = 0;

        if (!solveKTUtil(0, 0, 1, sol, iMove, jMove))
        {
            System.out.println("Solution doesn't exist");
            return false;
        }
        else
        {
            printSolution(sol);
        }

        return true;
    }

    public boolean solveKTUtil(int x, int y, int movei, int[][] sol, int[] xMove, int[] yMove) {

        int k, next_x, next_y;

        if (movei == N * N)
        {
            return true;
        }

        for (k = 0; k < 8; k++)
        {
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            if (isSafe(next_x, next_y, sol))
            {
                sol[next_x][next_y] = movei;

                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
                {
                    return true;
                }
                else
                {
                    sol[next_x][next_y] = -1;
                }
            }
        }

        return false;
    }
    public boolean stackPalindromecheck(Node head) {

        Node slow = head;
        boolean flag = true;

        Stack<Integer> s = new Stack<>();

        while (slow != null)
        {
            s.push(slow.data);
            slow = slow.next;
        }

        while (head != null)
        {
            int check = s.pop();

            if (head.data == check) 
            {
                flag = true;
            }
            else 
            {
                flag = false;
                break;
            }
            head = head.next;
        }

        return flag;
    }

}

public class Practice {

    public static void main(String[] args) throws ClassNotFoundException {
     
    Scanner sc = new Scanner(System.in);
    
    Revisit rv = new Revisit();

    System.out.print(rv.solveKT()); 
    sc.close();

    }
}