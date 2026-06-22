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
}

public class Revisit {
    
    public static void main(String[] args) {

        Churning ch = new Churning();

        String input = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(ch.ReverseString(input));

    }
}
