import java.util.*;

class Problem {

    public boolean isPrime(int n) {

        if (n < 1)
        {
            return false;
        }

        for (int i = 0; i <= Math.sqrt(n); i++)
        {
            if (i%n == 0)
            {
                return true;
            }
        }

        return false;
    }

    public int PalindromeCheck(int n ) {

        int reverse = 0; 
        
        while (n > reverse)
        {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (n == reverse)
        {
            return 1;
        }

        return 0;
    }
    ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++)
        {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++)
            {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++)
            {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }

        return B;
    }
}


public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Problem po = new Problem();

        
        ArrayList<ArrayList<Integer>> A = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]];

        ArrayList<ArrayList<Integer>> B = po.performOps(A);

        for (int i = 0; i < B.size(); i++)
        {
            for (int j = 0; j < B.get(i).size(); j++)
            {
                System.out.print(B.get(i).get(j) + " ");
            }
        }

        sc.close();

    }
}