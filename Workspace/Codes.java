import java.util.*;


class Structures {

    public void PrintDec(int n)
    {
        if (n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }

    public void PrintInc(int n)
    {
        if (n == 1)
        {
            System.out.print(1+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }

    public int fact(int n) {
        if (n == 0)
        {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;

        return fn;
    }

    public int fibo(int n) {

        if (n == 0 || n == 1)
        {
            return n;
        }

        int f1 = fibo(n-1);
        int f2 = fibo(n-2);

        int fn = f1+f2;

        return fn;
    }

    public int firstOccurance(int[] arr, int key, int i) {

        if (i == arr.length)
        {
            return -1;
        }
        if (arr[i] == key)
        {
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public int lastOccurence(int[] arr, int key, int i) {

        if (i == arr.length)
        {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key)
        {
            return i;
        }

        return isFound;
    }

    public int power(int x, int n) {

        if (n == 0)
        {
            return 1;
        }

        return x * power(x, n-1);
    }

    public int tilingProblem(int n) {

        if (n == 0 || n == 1)
        {
            return 1;
        }

        int vertical = tilingProblem(n-1);
        int horizontal = tilingProblem(n-2);

        int totalWays = vertical + horizontal;

        return totalWays;
    }

    public void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {

        if (idx == str.length())
        {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true)
        {
            removeDuplicates(str, idx+1, newStr, map);
        }
        else
        {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public int PairingFriends(int n) {

        if (n == 1 || n == 2)
        {
            return n;
        }

        int fnm1 = PairingFriends(n-1);
        int fnm2 = PairingFriends(n-2);

        int PairWays = (n-1) * fnm2;

        int totalWays = fnm1 + PairWays;

        return totalWays;
    }

    public void PrintBinaryStrings(int n, int lastPlace, String str) {

        if (n == 0)
        {
            System.out.println(str);
            return;

        }
        PrintBinaryStrings(n-1, 0, str+"0");

        if (lastPlace == 0)
        {
            PrintBinaryStrings(n-1, 1, str+"1");
        }
    }

    public void allOccurences(int[] arr, int key, int i) {

        if (i == arr.length)
        {
            return;
        }

        if (arr[i] == key)
        {
            System.out.print(i+" ");
        }

        allOccurences(arr, key, i+1);
    }

    public int BinarySearch(int[] arr, int target) {

        int n = arr.length;
        int left = 0, right = n-1;
        int mid = (left+right)/2;

        while (left <= right) {

            if (arr[mid] == target)
            {
                return mid;
            }

            else if (arr[mid] > target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }

        return -1;
    }

    public void DigitToWord(int number, String[] digit) {

        if (number == 0)
        {
            return;
        }

        int lastDigit = number % 10;
        DigitToWord(number/10, digit);
        System.out.print(digit[lastDigit]+" ");
    }
}



public class Codes {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        Structures sr = new Structures();

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        sr.DigitToWord(n, digits);
        

        
        
        sc.close();
    }
}
