import java.util.*;

// class MaxElements {

//     public int max(int a, int b, int c) {

//         if (a > b && a > c)
//         {
//             return a;
//         }
//         else if (b > a && b > c)
//         {
//             return b;
//         }
//         else 
//         {
//             return c;
//         }

//     }
// }

class PrimeNumbers {

    public void prime(int n) {

        int i = 2;
        
        while (i < n) 
        {
            if (n % i == 0)
            {
                System.out.print("It's not Prime");
                break;
            }
            else
            {
                i++;
            }

        }
    }


    public int natural(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }

        return sum;
    }

    public void even()
    {
        for (int i = 9; i <= 100; i++)
        {
            if (i%2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }

    public void reverse() {

        int n = 10899;
        int rev = 0;

        while (n > 0)
        {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }

    public boolean isPrime(int n) {

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n%i == 0)
            {
                isPrime = false;
            }
        }
        return isPrime;  
    }

    public void printPrime(int n) {

        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void sum(int n) {

        int evenSum = 0, OddSum = 0;

        for (int i = 0; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                OddSum += i;
            }
            else
            {
                evenSum += i;
            }
        }
        System.out.println("Sum of Odd and Even Integers: "+OddSum+" "+evenSum);
    }
    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }

        return fact;
    }

    public int bin(int n, int r) {

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int fact = factorial(n-r);

        int coff = n_fact/(r_fact * fact);

        return coff;
    }

    public void multiply(int n) {

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + "=" + n*i);
        }
    } 
    
    public void print(int row, int col) {

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void triangle(int n) {

        int count = 1;
        
        for (int line = 1; line <= n; line++)
        {
            for (int digit = 1; digit <= line; digit++)
            {
                System.out.print(count+ " ");
                count++;
            }

            for (int space = n-line; space >= 1; space--)
            {
                System.out.print("  ");
            }
            System.out.println();
        }

        
    }

    public void Py(int n) {

        

        for (int line = 1; line < n; line++)
        {
            for (int i = 1; i < n-line; i++)
            {
                System.out.print(i+ " ");
                
            }

            for (int i = 1; i < line; i++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void tribin(int n) {

        for (int line = 1; line <= n; line++)
        {
            for (int digit = 1; digit <= line; digit++)
            {
                if ((line+digit)%2 == 0)
                {
                    System.out.print(1 + " ");
                }
                else
                {
                    System.out.print(0 + " ");
                }
            }

            for (int space = n-line; space >= 1; space--)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void Butterfly(int n) {

        for (int line = 1; line <= n; line++)
        {
            for (int stars = 1; stars <= line; stars++)
            {
                System.out.print("* ");
            }

            for (int space = 1; space <= 2 * (n-line); space++)
            {
                System.out.print("  ");
            }

            for (int stars = 1; stars <= line; stars++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int line = n; line >= 1; line--)
        {
            for (int stars = 1; stars <= line; stars++)
            {
                System.out.print("* ");
            }

            for (int space = 1; space <= 2 * (n-line); space++)
            {
                System.out.print("  ");
            }

            for (int stars = 1; stars <= line; stars++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public void binary(int n) {

        int pow = 0, decNum = 0;

        while (n > 0)
        {
            int lastDigit = n % 10;
            decNum = (int) (decNum + (lastDigit * Math.pow(2, pow)));

            pow++;
            n /= 10;
        }

        System.out.println("Decimal of n: " + decNum);
    }

    public void decimal(int n) {

        int pow = 0,  bin = 0;

        while (n > 0)
        {
            int rem = n % 2;
            bin = (int) (bin + (rem * Math.pow(10, pow)));

            pow++;
            n /= 2;
        }

        System.out.println("Binary of n: " + bin);
    }

    public int BinarySearch(int[] arr, int key) {
        int n = arr.length;

        int low = 0, high = n-1;

       while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        } 
        else if (arr[mid] < key || arr[mid] > key) {
           low = mid + 1;  // ✅ exclude mid
        } 
        else {
            high = mid - 1;    // ✅ exclude mid
        }
    }
    return -1;
    }

    public void oppo(int[] arr) {

        int left = 0, right = arr.length - 1;

        while (left < right)
        {
            int rev = arr[left];
            arr[left] = arr[right];
            arr[right] = rev;

            left++;
            right--;
        }
    }

    public void pairs(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            int pair = arr[i];
            for (int j = i+1; j < n; j++)
            {
                System.out.print("("+pair+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public void sub(int[] arr) {

        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
    public int opt(int[] arr) {
        
        int n = arr.length;
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
        {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) currSum = 0;
        }
        return maxSum;
    }

    public int soman(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (arr[i] == arr[j])
                {
                    return 1;
                }
            }
        }

        return -1;
    }

    public int stocks(int[] price) {

        int n = price.length;

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++)
        {
            if (buyPrice < price[i])
            {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else
            {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public void bubbles(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n-1-i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
    }
    public void print(int[] arr) {

        int n = arr.length;

        for (int i = 0 ; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void selection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            int minPos = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[minPos] > arr[j])
                {
                    minPos = j;
                }
            }

            int swap = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = swap;
        }
    }

    public void insertion(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++)
        {
            int prev = i-1, curr = arr[i];

            while (prev >= 0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public void spiralMatrix(int[][] matrix) {

        int startRow = 0, startcol = 0;
        int endRow = matrix.length-1, endCol = matrix[0].length-1;

        while (startRow <= endRow && startcol <= endCol)
        {
            for (int j = startcol; j <= endCol; j++)
            {
                System.out.print(matrix[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++)
            {
                System.out.print(matrix[i][endCol] + " ");
            }

            for (int j = endCol-1; j >= startcol; j--)
            {
                if (startRow == endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            for (int i = endRow -1; i >= startRow + 1; i--)
            {
                if (startcol == endCol) break;

                System.out.print(matrix[i][startcol] + " ");
            }

            startRow++;
            endRow--;
            startcol++;
            endCol--;
        }
    }

    public int diagonals(int[][] matrix) {

        int n = matrix.length;
        //int m = matrix[0].length;

        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            // for (int j = 0; j < m; j++)
            // {
            //     if (i == j) 
            //     {
            //         sum += matrix[i][j];
            //     }
            //     else if ((i+j) == n-1)
            //     {
            //         sum += matrix[i][j];
            //     }
            // }

            sum += matrix[i][i];

            if (i != n-1-i)
                sum += matrix[i][n-1-i];
        }

        return sum;
    }

    public int balance(int[] arr) {
        int n = arr.length;
        int leftsum = 0, rightsum = 0;

        if (n % 2 != 0)
        {
            return -1;
        }

        int mid = n/2;

        for (int i = 0; i < mid; i++)
        {
            leftsum += arr[i];
        }

        for (int i = mid; i < n; i++)
        {
            rightsum += arr[i];
        }

        if (leftsum == rightsum)
        {
            return 0;
        }
        else
        {
            return Math.abs(leftsum - rightsum);
        }
    }

    public int casen(int[][] matrix, int key) {

        int row = 0, col = matrix[0].length-1;

        while ( row < matrix.length && col >= 0)
        {
            if (matrix[row][col] == key)
            {
                System.out.print("Key is at index: " + "(" + row + "," + col + ")");
                //return 1;
            }
            else if (matrix[row][col] > key)
            {
                col--;
            }
            else 
            {
                row++;
            }

        }

        return -1;
    }

    public void transpose(int[][] matrix) {

        int row = matrix.length, col = matrix[0].length-1;

        int[][] trans = new int[col][row];

        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                trans[j][i] = matrix[i][j];
            }
        }
    }

    public boolean isPalindrome(String str) {

        int n = str.length();

        for (int i = 0; i < n/2; i++)
        {
            if (str.charAt(i) != str.charAt(n-1-i))
            {
                return false;
            }
        }

        return true;
    }

    public float getPath(String path) {

        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++)
        {
            int dir = path.charAt(i);

            if (dir == 'N')
            {
                y++;
            }
            else if (dir == 'E')
            {
                x++;
            }
            else if (dir == 'S')
            {
                y--;
            }
            else 
            {
                x--;
            }

        }
         int X2 = x*x, Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }

    public String subString(String str, int si, int ei) {

        String substr = "";

        for (int i = si; i < ei; i++)
        {
            substr += str.charAt(i);
        }

        return substr;
    }

    public String compareString(String[] arr) {

        String largest = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (largest.compareTo(arr[i]) < 0)
            {
                largest = arr[i];
            }
        }

        return largest;
    }

    public String compression(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;

            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {

                count++;
                i++;
            }

            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }

        return newStr;
    }

    public int seven(int[][] matrix, int p) {

        int sum = 0;

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {

                if (j == p) {
                    sum += matrix[j][i];
                }
            }
        }

        return sum;
    }

    public void lowercaseVowelcount(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                count++;
            }


        }
        System.out.print("The frequency of lowercase vowel is: "+ count);
    }

    public void AnagramString(String str1, String str2) {

        str1.toLowerCase();
        str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] charr1 = str1.toCharArray();
            char[] charr2 = str2.toCharArray();

            Arrays.sort(charr1);
            Arrays.sort(charr2);

            boolean result = Arrays.equals(charr1, charr2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + "are not anagrams");
        }

    }

    public void squaresort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n;i++) {

            arr[i] = (int)Math.pow(arr[i], 2);
        }

        Arrays.sort(arr);
    }

    public void efficientsquaresort(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;

        int[] result = new int[n];

        for (int i = n-1; i > 0; i--) {
            if (Math.abs(arr[left]) >= Math.abs(arr[right])) {
                result[i] = arr[left]*arr[left];
                left++;
            }
            else {
                result[i] = arr[right]*arr[right];
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }

    }

    public String ReverseCase(String str) {

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length()-1; i++) 
        {
            if (str.charAt(i) == ' ' && i < str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else 
            {
                sb.append(str.charAt(i));
            }
        }
        System.out.println("String length: " + str.length());
        return sb.toString();
    }

    public void BitMask(int n) {

        int bitmask = 1;

        if ((n & bitmask) == 0) {
            System.out.print("Even Number");
        }

        else {
            System.out.print("Odd Number");
        }
    }

    public String largeString(int[] arr) {

        String output = arr.toString();

        return output;
    }

    public void append(int[] arr) {


        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i <= arr.length-1; i++)
        {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }

    public int getBit(int n, int i) {

        int bitmask = 1 << i;

        if ((n & bitmask) == 0)
        {
            return 0;
        }
        else 
        {
            return 1;
        }
    }

    public int SetBit(int n, int i) {
        int bitmask = 1 << i;

        return n | bitmask;
    }

    public int ClearBit(int n, int i) {

        int bitmask = ~(1 << i);

        return n & bitmask;
    }

    public int UpdateBit(int n, int i, int newBit) {

        if (newBit == 0)
        {
            return ClearBit(n, i);
        }
        else 
        {
            return SetBit(n, i);
        }

        // n = ClearBit(n, i);

        // int bit = newBit << i;

        // return n | bit;
    }

    public int TrimBit(int n, int i) {
        
        int bitmsk = (~0) << i;

        return n & bitmsk;
    }

    public String LargestString(int[] arr) {

        String[] strs = Arrays.stream(arr)
                              .mapToObj(String::valueOf)
                              .toArray(String[]::new);
        Arrays.sort(strs, (a,b) -> (b+a).compareTo(a+b));


        String result = String.join("", strs);

        if (result.charAt(0) == '0')
        {
            return "0";
        }
        
        return result;
    }

    public int RangeClear(int n, int i, int j) {

        int a = (~0) & (j+1);
        int b = (1 << i) - 1;

        int bitmask = a | b;

        return n & bitmask;
    }

    public boolean isPower(int n) {

        return (n & (n-1)) == 0;
    }

    public int SetBits(int n) {
        int count = 0; 

        while (n > 0) 
        {
            if ((n & 1) != 0)
            {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    /*  Sum of pairwise Hamming Distance

Problem Description

Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding bits are different.

Given an array A of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array. Return the answer modulo 1000000007.


Problem Constraints

1 <= |A| <= 200000

1 <= A[i] <= 109


Input Format

First and only argument is array A.


Output Format

Return one integer, the answer to the problem.


Example Input

Input 1:

 A = [1]

Input 2:

 A = [2, 4, 6]



Example Output

Output 1:

 0

Output 2:

 8



Example Explanation

Explanation 1:

 No pairs are formed.

Explanation 2:

 We return, f(2, 2) + f(2, 4) + f(2, 6) + f(4, 2) + f(4, 4) + f(4, 6) + f(6, 2) + f(6, 4) + f(6, 6) = 8



*/
    public int HammingDistance(int[] arr) {

        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                int pairbit = arr[i] ^ arr[j];
                 while (pairbit > 0)
                {
                    if ((pairbit & 1) != 0)
                    {
                        count++;
                    }
                    pairbit = pairbit >> 1;
                }
            }
        }

       

        return 2*count;
    }

    public int OptimalHammingDistance(int[] arr) {

        int n = arr.length;
        long ans = 0;
        int mod = 1000000007;

        for (int bit = 0; bit < 31; bit++)
        {
            long count0 = 0;
            long count1 = 0;
            int bitmask = 1 << bit;

            for (int i = 0; i < n; i++)
            {
                if ((arr[i] & bitmask) == 0)
                {
                    count0++;
                }
                else
                {
                    count1++;
                }
            }

            ans =  (ans + (2 * count0 * count1) % mod) % mod;
        }

        return (int) ans;
    }
    public int FastExponential(int a, int n) {

        int ans = 1;

        while (n > 0)
        {
            if ((n & 1) != 0)
            {
                ans *= a;
            }
            a *= a;
            n = n>>1;
        }

        return ans;
    }

    public void Rotation(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] rotatematrix = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                rotatematrix[n-1-j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++)
        {
            System.arraycopy(rotatematrix[i], 0, matrix[i], 0, n);
        }
    }

    public void ArrayCopy(int[][] CopyArray) {

        int n = CopyArray.length;
        int m = CopyArray[0].length;

        int[][] PasteArray = new int[n][m];
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                PasteArray[i][n-1-j] = CopyArray[j][i];
            }
        }

        for (int i = 0; i < n; i++)
        {
            System.arraycopy(PasteArray[i], 0, CopyArray[i], 0, n);
        }
        
    }

    /*Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.
        If such an arrangement is not possible, it must be rearranged in the lowest possible order i.e., sorted in ascending order. */

    public int[] NextPermutation(int[] arr) {

        int n = arr.length;
        int pivot = -1;

        for (int i = n-2; i >= 0; i--)
        {
            if (arr[i] < arr[i+1])
            {
                pivot = i;
                break;
            }
        }
        if (pivot == -1)
        {
            Arrays.sort(arr);
        }
        else if (pivot != -1)
        {
            for (int i = n-1; i > pivot; i--)
            {
                if (arr[i] > arr[pivot])
                {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
        }
        
        Arrays.sort(arr, pivot+1, n);

        

        return arr;
    }

    /*Given a positive integer n and a string s consisting only of letters D or I, you have to find any permutation of first n positive integer that satisfy the given input string.

        D means the next number is smaller, while I means the next number is greater.

            Notes

                Length of given string s will always equal to n - 1
                Your solution should run in linear time and space.

            Example :

            Input 1:

            n = 3

            s = ID

            Return: [1, 3, 2]

        */
    public String Permutation(String s)
    {
        int n = s.length();
        int[] output = new int[n+1];

        int low = 1, high = n+1;

        for (int i = 0; i < n; i++)
        {
            if (s.charAt(i) == 'I')
            {
                output[i] = low++;
            }
            else 
            {
                output[i] = high--;
            }
        }

        output[n] = low;

        StringBuilder sb = new StringBuilder("");

        for (int i : output)
        {
            sb.append(i);
        }
        String result = Arrays.toString(output);
        return result;
    }

    /*Given an unsorted integer array, find the first missing positive integer.
Your algorithm should run in O(n) time and use constant space. */

    public int[] MissingInteger(int[] arr) {
        
        Arrays.sort(arr);
        int count = 1;
        int missing = 0;
        int duplicate = -1;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] <= 0 || arr[i] > count)
            {
                continue;
            }
            else 
            {
                if (arr[i] == count)
                {
                    count++;
                }
                else 
                {
                    missing = count;   
                }
            }
        }

        if (missing == 0)
        {
            missing = count;
        }

        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i] == arr[i+1])
            {
                duplicate = arr[i];
            }
        }

        
        
        return new int[] {duplicate, missing};
    }

    public int[] Duplicate(int[] arr) {

        int n = arr.length;

        if (n == 0)
        {
            return new int[] {-1, 1};
        }

        for (int i = 0; i < n; i++)
        {
            if (arr[i] <= 0 || arr[i] > n)
            {
                arr[i] = n+1;
            }
        }

        int duplicate = -1;

        for (int i = 0; i < n; i++)
        {
            int x = Math.abs(arr[i]);
            if (x >= 1 && x <= n)
            {
                if (arr[x-1] > 0)
                {
                    arr[x-1] = -arr[x-1];
                }
                else 
                {
                    if (duplicate == -1)
                    {
                        duplicate = x;
                    }
                }
            }
        }

        int missing = n+1;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0)
            {
                missing = i+1;
                break;
            }
        }

        return new int[] {duplicate, missing};
    }
    /*You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.

    If so, return the integer. If not, return -1.

    If there are multiple solutions, return any one. 
    public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    }
    }

    */

    public List<Integer> repeatedNumber(final List<Integer> a) {

        Collections.sort(a);
        List<Integer> duplicates = new ArrayList<>();
        

        for (int i = 0; i < a.size()-1; i++)
        {
            if (a.get(i) == a.get(i+1) )
            {
                if (duplicates.isEmpty() || duplicates.get(duplicates.size()-1) != a.get(i))
                {
                    duplicates.add(a.get(i));
                }

                while (i < a.size()-1 && a.get(i) == a.get(i+1))
                {
                    i++;
                }
            }
            else 
            {
                //return -1;
            }
        }

        return duplicates;
    }

    public int RepeatDigit(final List<Integer> a) {

        int n = a.size();
        int fcnd = 0, scnd=0, fcnt = 0, scnt = 0; // fcnd -> first candidate  || fcnt -> first count;
        int val=0;
        if (n == 0) return -1;

        for (int i = 0; i < n-1; i++)
        {
            val = a.get(i);
            
            if (fcnt > 0 && val == fcnd)
            {
                fcnt++;
            }
            else if (scnt > 0 && val == scnd)
            {
                scnt++;
            }
            else if (fcnt == 0)
            {
                fcnd = val;
                fcnt = 1;
            }
            else if (scnt == 0)
            {
                scnd = val;
                scnt = 1;
            }
            else 
            {
                fcnt--;
                scnt--;
            }
        }

        int finalcount1 = 0, finalcount2 = 0;

        for (int i = 0; i < n; i++)
        {
            if (val == fcnd)
            {
                finalcount1++;
            }
            else if (val == scnd)
            {
                finalcount2++;
            }
        }

        int threshold = n/3;

        if (finalcount1 > threshold)
        {
            return fcnd;
        }
        else if (finalcount2 > threshold)
        {
            return scnd;
        }
        else 
        {
            return -1;
        }
    }
    
   /*
    Problem Description

    Given four positive integers A, B, C, D, determine if there’s a rectangle such that the lengths of its sides are A, B, C and D (in any order).

    If any such rectangle exist return 1 else return 0.



    Problem Constraints

    1 <= A, B, C, D <= 100


    Input Format

    First argument is an interger A.

    Second argument is an interger B.

    Third argument is an interger C.

    Fourth argument is an interger D.



    Output Format

    If any such rectangle exist whose sides are A, B, C, D in any orde then return 1 else return 0.


    Example Input

    Input 1:

    A = 1
    B = 1
    C = 2
    D = 2

    Input 2:

    A = 1
    B = 2
    C = 3
    D = 4



    Example Output

    Output 1:

    1

    Output 2:

    0



    Example Explanation

    Explanation 1:

    
    The rectangle drawn above is one of the rectangles that can be formed by side length of 1, 1, 2, 2 so we will return 1.

    Explanation 2:

    No such rectangle exist whose sides are 1, 2, 3, 4. So, we will return 0.


   */

    public boolean isRectangle(int a, int b, int c, int d) {

        if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}



public class Problem {
    public static void main(String[] args) {
        
        PrimeNumbers pl = new PrimeNumbers();
        Scanner sc = new Scanner(System.in);

        System.out.println(pl.isRectangle(1,1,1,1));
        
        sc.close();
    }
}
