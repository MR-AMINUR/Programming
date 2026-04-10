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
}


public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Problem po = new Problem();

        System.out.print("Enter the number to check the parity: ");
        int n = sc.nextInt();

        System.out.print(po.isPrime(n));

        sc.close();

    }
}