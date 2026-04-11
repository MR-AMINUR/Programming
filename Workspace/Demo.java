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
    
}


public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Problem po = new Problem();

        System.out.print("Enter the number to check the palindrome: ");
        int n = sc.nextInt();

        System.out.print(po.PalindromeCheck(n));

        sc.close();

    }
}