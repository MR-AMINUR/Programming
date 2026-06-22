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
}

public class Revisit {
    
    public static void main(String[] args) {

        Churning ch = new Churning();

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        ch.PushAtBottom(s, 4);

        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
}
