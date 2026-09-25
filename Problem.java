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

    /*Problem Description

Given a target A on an infinite number line, i.e. -infinity to +infinity.

You are currently at position 0 and you need to reach the target by moving according to the below rule:
In ith move you can take i steps forward or backward.

Find the minimum number of moves required to reach the target.

Problem Constraints

-109 <= A <= 109


Input Format

First and only argument is an integer A.


Output Format

Return an integer denoting the minimum moves to reach target.


Example Input

Input 1:

 3

Input 2:

 2



Example Output

Output 1:

 2

Output 2:

 3



Example Explanation

Explanation 1:

 On the first move we step from 0 to 1.
 On the second step we step from 1 to 3.

Explanation 2:

 On the first move we step from 0 to 1.
 On the second move we step  from 1 to -1.
 On the third move we step from -1 to 2.

 */

    public int findPath(int A) {

        int moves = 0;
        int sum = 0;
        int target = Math.abs(A);

        while (sum < target) 
        {
            moves++;
            sum += moves;
        }
        
        while (((sum - target) % 2) != 0)
        {
            moves++;
            sum += moves;
        }

        return moves;
    }

    /*Given a positive integer that fits in a 32-bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0.
A and P both should be integers.


Problem Constraints
1 <= A <= 109


Input Format
The first argument is an integer A.


Output Format
Return an integer, 1 for True, 0 for False


Example Input
A = 4


Example Output
1


Example Explanation
A = 4, it can be written as 2 ^ 2

 */
    public int isPower(int A) {
    
       if (A == 1)
        {
            return 1;
        }
        for (int a = 2; a <= Math.sqrt(A); a++)
        {
            for (int p = 2; p <= 32; p++)
            {
                int power = (int)Math.pow(a,p);
                
                if (power == A)
                {
                    return 1;
                }
                if (power < A)
                {
                    continue;
                }
                break;
            }
        }
        
        return 0;
    }

    /*You are given two numbers A and B.

You have to add them without using arithmetic operators and return their sum.


Problem Constraints
1 <= A, B <= 109


Input Format
The first argument is the integer A. The second argument is the integer B.


Output Format
Return a single integer denoting their sum.


Example Input
Input 1:

A = 3
B = 10

Input 2:

A = 6
B = 1



Example Output
Output 1:

13

Output 2:

7



Example Explanation
Explanation 1:

3 + 10 = 13

Explanation 2:

6 + 1 = 7.
Note, you have to add without using arithmetic operators.

 */

    public int pairSum(int x, int y) {

        int a, b;

        do
        {
            a = x & y;
            b = x ^ y;
            x = a << 1;
            y = b;
        } while (a != 0);

        return b; 
    }

    /*Problem Description

Given a number A in a form of string.

You have to find the smallest number that has same set of digits as A and is greater than A.

If A is the greatest possible number with its set of digits, then return -1.



Problem Constraints

 1 <= A <= 10100000

 A doesn't contain leading zeroes.



Input Format

First and only argument is an numeric string denoting the number A.


Output Format

Return a string denoting the smallest number greater than A with same set of digits , if A is the largest possible then return -1.


Example Input

Input 1:

 A = "218765"

Input 2:

 A = "4321"



Example Output

Output 1:

 "251678"

Output 2:

 "-1"



Example Explanation

Explanation 1:

 The smallest number greater then 218765 with same set of digits is 251678.

Explanation 2:

 The given number is the largest possible number with given set of digits so we will return -1.
 */


    public String SwapSort(String str) {

        if (str.charAt(0) > str.charAt(str.length()-1))
        {
            return "-1";
        }
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr, 2, str.length());
        
        if (arr[1] < arr[2])
        {
            char temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        return new String(arr);
    }

    public String solve(String A) {
        if (A == null || A.length() <= 1) {
            return "-1";
        }
        
        char[] arr = A.toCharArray();
        int n = arr.length;
        
        // Step 1: Find the first character from the right that is smaller than its next character
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        // If no such character is found, return "-1"
        if (i < 0) {
            return "-1";
        }
        
        // Step 2: Find the smallest character to the right of arr[i] that is greater than arr[i]
        int j = n - 1;
        while (j > i && arr[j] <= arr[i]) {
            j--;
        }
        
        // Step 3: Swap arr[i] and arr[j]
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        // Step 4: Reverse the suffix starting from i+1
        reverse(arr, i + 1, n - 1);
        
        return new String(arr);
    }
    
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*Given an array A of size N. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.
    Lets say N = size of the array. Then, following holds true :

        All elements in the array are in the range [0, N-1]
        N * N does not overflow for a signed integer


    Constraints:

    1 <= N <= 5×104

    0 <= A[i] <= N - 1

    The elements of A are distinct 

    Input Format

    The argument A is an array of integers

    Example 1:

    Input : [1, 0]
    Return : [0, 1]

    Example 2:

    Input : [0, 2, 1, 3]
    Return : [0, 1, 2, 3] */

    public void arrange(ArrayList<Integer> a) {
		
		for (int i = 0; i < a.size(); i++)
		{
			a.set(i, (a.get(i) + (a.get(a.get(i)) % a.size()) * a.size())); // set(index, value)
		}
		for (int i = 0; i < a.size(); i++)
		{
			a.set(i, a.get(i)/a.size());
		}
		
		return;
	}

    /*Given a column title A as appears in an Excel sheet, return its corresponding column number.


    Problem Constraints

    1 <= |A| <= 100


    Input Format

    First and only argument is string A.


    Output Format

    Return an integer


    Example Input

    Input 1:

    "A"

    Input 2:

    "AB"



    Example Output

    Output 1:

    1

    Output 2:

    28



    Example Explanation

    Explanation 1:

    A -> 1

    Explanation 2:

    A  -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    */

    public int StringtoDigit(String input) {

        int result = 0;

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);

            int digit = ch - 'A' + 1;

            result = result * 26 + digit;
        }

        return result;
    }

    public String DigitToString(int n) {

        String result = "";

        while ( n > 0) {

            n = n-1;

            int rem = n % 26;

            char letter = (char) (rem + 'A');

            result = letter + result;

            n = n / 26;
        }

        return result;
    }

    /*
    Problem Description
 
 

    Determine whether an integer is a palindrome. Do this without extra space.

    A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.


    Problem Constraints
    INT_MIN <= A <= INT_MAX


    Input Format
    The first argument is an integer A.


    Output Format
    Return 1 if A is a Palindrome Integer else return 0.


    Example Input
    Input 1:

    A = 12121

    Input 2:

    A = 123



    Example Output
    Output 1:

    1

    Output 2:

    0



    Example Explanation
    Explanation 1:

    12121 when reversed will be 12121, and 12121 = 12121, hence a palindrome number.


    Explanation 2:

    123 when reversed will be 321, and 123 != 321, hence not a palindrome number
    */

    public int PalindromeCheck(int n) {

        if (n < 0 || (n % 10 == 0 && n != 0))
        {
            return -1;
        }

        int reverse = 0;
        while (n > reverse)
        {
            int digit = n % 10;
            reverse = reverse*10 + digit;
            n = n / 10;
        }

        if (reverse == n || (n == reverse/10))
        {
            return 1;
        }

        return 0;
    }

    /*Problem Description

    Given a numeric string A representing a large number you need to find the next smallest palindrome greater than this number.


    Problem Constraints

    1 <= |A| <= 100

    A doesn't start with zeroes and always contain digits from 0-9.



    Input Format

    First and only argument is an string A.


    Output Format

    Return a numeric string denoting the next smallest palindrome greater than A.


    Example Input

    Input 1:

    A = "23545"

    Input 2:

    A = "999"



    Example Output

    Output 1:

    "23632"

    Output 2:

    "1001"

    public String solve(String A) {
        }
    */

    public String smallestPalindrome(String num) {

        if (num.charAt(0) == '0')
        {
            return "-1";
        }
        int n = 0;
        for (int i = 0; i < num.length(); i++)
        {
            char ch = num.charAt(i);

            if (ch == '9')
            {
                n = Integer.parseInt(num);
                n += 2;
            }
        }

        String result = String.valueOf(n);

        return result;

    }

    public String SmallestnextPalindrome(String input) {
        int l = input.length(); // input String length

        // edge cases

        if (input.charAt(0) == '0')
        {
            return "-1";
        }
        if (input.matches("9+"))
        {
            return "1" + "0".repeat(l-1) + "1";
        }

        // Palindrome (mirror of left half)

        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < l/2; i++)
        {
            sb.setCharAt(l-i-1, sb.charAt(i));
        }

        // Palindrome Comparison

        if ((sb.toString()).compareTo(input) > 0)
        {
            return sb.toString();
        }
        else 
        {
            int s = sb.length();
            int c = 1;
            int idx;

            if (s % 2 == 0)
            {
                idx = (s/2) -1;
            }
            else 
            {
                idx = s/2;
            }
            
            while (idx >= 0 && c > 0)
            {
                int digit = (sb.charAt(idx)-'0' + c);
                c = digit / 10;
                digit = digit % 10;

                sb.setCharAt(idx, (char)(digit + '0'));
                idx--;
            }

            for (int i = 0; i < s/2; i++)
            {
                sb.setCharAt(s-i-1, sb.charAt(i));
            }
        }
        return sb.toString();
    }    

    /*
    Given 2 non-negative integers A and B, find gcd(A, B).
    GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
    Both A and B fit in a 32-bit signed integer.
    NOTE: DO NOT USE LIBRARY FUNCTIONS


    Problem Constraints
    0 <= A <= 109
    0 <= B <= 109


    Input Format
    The first argument is an integer A.
    The second argument is an integer B.


    Output Format
    Return the Greatest Common Divisor of A and B


    Example Input
    Input 1:

    A = 6
    B = 9



    Example Output
    Output 1:

    3



    Example Explanation
    Explanation 1:

    3 is the GCD of 6 and 9


    public class Solution {
        public int gcd(int A, int B) {
        }
    }

    */

    public int gcd(int a, int b) {

        if (b == 0)
        {
            return a;
        }
        else 
        {
            return gcd(b, a % b);
        }
    }

    /*
        Problem Description

        Given an integer A you need to find the Ath fibonacci number modulo 109 + 7.

        The first fibonacci number F1 = 1

        The first fibonacci number F2 = 1

        The nth fibonacci number Fn = Fn-1 + Fn-2 (n > 2)


        Problem Constraints

        1 <= A <= 109.


        Input Format

        First argument is an integer A.


        Output Format

        Return a single integer denoting Ath fibonacci number modulo 109 + 7.


        Example Input

        Input 1:

        A = 4

        Input 2:

        A = 3



        Example Output

        Output 1:

        3

        Output 2:

        2



        Example Explanation

        Explanation 1:

        F3 = F2 + F1 = 1 + 1 = 2
        F4 = F3 + F2 = 2 + 1 = 3

        Explanation 2:

        F3 = F2 + F1 = 1 + 1 = 2

    
    */

    public int Fibo(int n) {
        if (n <= 2)
        {
            return 1;
        }
        else 
        {
            return Fibo(n-1) + Fibo(n-2);
        }
    }

    /*
        Problem Description
 
 

        Given a large number represent in the form of an integer array A, where each element is a digit.

        You have to find whether there exists any permutation of the array A such that the number becomes divisible by 60.

        Return 1 if it exists, 0 otherwise.


        Problem Constraints
        1 <= |A| <= 105
        0 <= Ai <= 9


        Input Format
        The first argument is an integer array A.


        Output Format
        Return a single integer '1' if there exists a permutation, '0' otherwise.


        Example Input
        Input 1:

        A = [0, 6]

        Input 2:

        A = [2, 3]



        Example Output
        Output 1:

        1

        Output 2:

        0



        Example Explanation
        Explanation 1:

        We can rearrange the digits to form 60, which is divisible by 60.

        Explanation 2:

        There are only two possible permutations: [23, 32].
        Both of them are not divisible by 60.


    */
    
    public void swap(ArrayList<Integer> arr, int a, int b) {
        
        Integer temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
        
    }

    public int convertArrayToNumber(ArrayList<Integer> arr) {
        int num = 0;
        for (int digit : arr) {
            num = (num * 10) + digit;
        }

        return num;
    }

    public void sortCombination(ArrayList<Integer> arr, int start, ArrayList<Integer> result) {

        if (start == arr.size())
        {
            if (arr.get(0) == 0)
            {
                return;
            }

            result.add(convertArrayToNumber(arr));
            return;
        }
        for (int i = start; i < arr.size(); i++)
        {
            swap(arr, start, i);
            sortCombination(arr, start+1, result);
            swap(arr, start, i);
        }   
    }

    public int divisible60(int[] arr) {
        int sum = 0;
        int zeroCount = 0;
        boolean hasEven = false;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            if (arr[i] == 0)
            {
                zeroCount++;
            }

            if (arr[i] != 0 && arr[i] % 2 == 0)
            {
                hasEven = true;
            }
        }

        if (sum % 3 != 0) 
        {
            return 0;
        }
        if (zeroCount == 0)
        {
            return 0;
        }

        if (hasEven || zeroCount >= 2)
        {
            return 1;
        }

        return 0;
    }

    /*
    Problem Description
 
 

        You are given an integer array A of length N.

        For every integer X in the array, you have to find out the number of integers Y, 
        such that 1 <= Y <= X, and the number of divisors of Y is a power of 2.

        For example, 6 has the following divisors - [1, 2, 3, 6]. This is equal to 4, which is a power of 2.

        On the other hand, 9 has the following divisors [1, 3, 9] which is 3, which is not a power of 2.

        Return an array containing the answer for every X in the given array.


        Problem Constraints
        1 <= N <= 10^5
        1 <= Amax <= 10^6
        Sum of Amax over all test cases will not exceed 5 * 106


        Input Format
        The first argument is the integer array A.


        Output Format
        Return an array containing the answer for every X in the given array.


        Example Input
        Input 1:

        A = [1, 4]

        Input 2:

        A = [5, 10]



        Example Output
        Output 1:

        [1, 3]

        Output 2:

        [4, 8]



        Example Explanation
        Explanation 1:

        The numbers 1, 2, 3 have the required number of divisors.

        Explanation 2:

        Only 4 and 9 are the numbers less than or equal to 10 which do not have the required number of divisors.

    */


    public boolean isPowerofTwo(int n) {
        if ((n & (n-1)) == 0)
        {
            return true;
        }
        return false;
    }

    public void divisorCount(int value) {
        
        int count = 0;
        int n = 1;
        while (n <= value)
        {
            int firstCount = 0;
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                {
                    System.out.print(i+ " ");
                    firstCount++;
                }
                
            }
            if ((firstCount & (firstCount - 1)) == 0)
            {
                count++;
            }
            n++;
            System.out.println();
        }
        System.out.println(count);
    }

    // public int OptimalDivisorCount(int value) {
        

    //     for (int i = 1; i <= value; i++)
    //     {
    //         for (int j = i; j <= value; j += i)
    //         {

    //         }
    //     }
    // }

    /*
    Problem Description
 
 

        Given an integer A, return the number of trailing zeroes in A!.

        Note: Your solution should be in logarithmic time complexity.



        Problem Constraints

        0 <= A <= 10000000


        Input Format

        First and only argumment is integer A.


        Output Format

        Return an integer, the answer to the problem.


        Example Input

        Input 1:

        A = 4

        Input 2:

        A = 5



        Example Output

        Output 1:

        0

        Output 2:

        1



        Example Explanation

        Explanation 1:

        4! = 24

        Explanation 2:

        5! = 120

    */

    public int Factorial(int n) {
        if (n == 0) 
        {
            return 1;
        }

        return (n * Factorial(n-1));
    }

    public int ZeroCount(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++)
        {
            int temp = i;

            while (temp % 5 == 0)
            {
                count++;
                temp /= 5;
            }
        }
        
        return count;
    }

    /*
        Problem Description                          
        Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.

        Assume that no characters are repeated.

        Note: The answer might not fit in an integer, so return your answer % 1000003

        Problem Constraints

        1 <= |A| <= 1000


        Input Format

        First argument is a string A.


        Output Format

        Return an integer denoting the rank of the given string.


        Example Input

        Input 1:

        A = "acb"

        Input 2:

        A = "a"



        Example Output

        Output 1:

        2

        Output 2:

        1



        Example Explanation

        Explanation 1:

        Given A = "acb".
        The order permutations with letters 'a', 'c', and 'b' : 
        abc
        acb
        bac
        bca
        cab
        cba
        So, the rank of A is 2.

        Explanation 2:

        Given A = "a".
        Rank is clearly 1.


    */

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public int FindRank(String inp) {
        
        int rank = 1;

        for (int i = 0; i <= inp.length()-1; i++)
        {
            char s1 = inp.charAt(i);
            int smallerCount = 0;
            
            for (int j = i+1; j <= inp.length()-1; j++)
            {
                char s2 = inp.charAt(j);
                if (s1 > s2)
                {
                    smallerCount++;
                }
                
            }

            smallerCount *= (factorial(inp.length() - i - 1));
            rank = rank + smallerCount;
        }

        // This answer satisfies the required time complexity of the above descripted problem . Just add "%100003" to the return statements for both functions...

        return rank;
    }

    /*public int factorial(int i){
        if(i==1){
            return 1;
        }
        if(i==0){
            return 1;
        }
        return (i*factorial(i-1))%1000003;
    }
    public int findRank(String A) {
        int n=A.length();
        int fact[]=new int[n];
        int rank[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for (int j=i+1;j<n;j++){
                if(A.charAt(i)>A.charAt(j)){
                    count++;
                }
            }
            rank[i]=count;
        }
        for(int i=0;i<n;i++){
             ans=ans +(rank[i]*factorial(n-1-i))%1000003;
        }
        return (ans+1)%1000003;
       
    } */

    

    /*
    Problem Description
 
 
        You are given two positive numbers A and B. You need to find the maximum valued integer X such that:

        X divides A i.e. A % X = 0
        X and B are co-prime i.e. gcd(X, B) = 1
        For example,

        A = 30
        B = 12
        We return
        X = 5


        Problem Constraints
        1<=A,B<=1e9


        Input Format
        First argument is A.
        Second argument is B.


        Output Format
        Find the maximum valued integer X which satisfies the above properties.
    */

    public int FindX (int a, int b) {

        while (true) {
            int g = gcd(a, b);
            if (g == 1)
            {
                return a;
            }

            a /= g;
        }
    }

    /*
    Problem Description
 
 

        Given a string A, find the rank of the string amongst its permutations sorted lexicographically. Note that the characters might be repeated. If the characters are repeated, we need to look at the rank in unique permutations. Look at the example for more details.

        NOTE: 

            The answer might not fit in an integer, so return your answer % 1000003 where 1000003 is a prime number.
            String A can consist of both lowercase and uppercase letters. Characters with lesser ASCII values are considered smaller, i.e., 'a' > 'Z'.



        Problem Constraints

        1 <= len(A) <= 1000000 


        Input Format

        First argument is a string A.


        Output Format

        Return an integer denoting the rank.


        Example Input

        Input 1:

        A = "aba"

        Input 2:

        A = "bca"



        Example Output

        Output 1:

        2

        Output 2:

        4



        Example Explanation

        Explanation 1:

        The order permutations with letters 'a', 'a', and 'b' :
            aab
            aba 
            baa
        So, the rank is 2.

        Explanation 2:

        The order permutations with letters 'a', 'b', and 'c' :
            abc
            acb 
            bac
            bca
            cab
            cba
        So, the rank is 4. */

    public void StringRank(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Character key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }
    }
    
    /*Problem Description

        You are given an integer A which represents the length of a permutation.
        A permutation is an array of length A where all the elements occur exactly once and in any order.
        For example, [3, 4, 1, 2], [1, 2, 3] are examples of valid permutations while [1, 2, 2], [2] are not.

        You are also given an integer B.
        If all the permutation of length A are sorted lexicographically, return the Bth permutation.
                                             
        Problem Constraints
        1 <= A <= 105
        1 <= B <= min(1018, A!), where A! denotes the factorial of A.

        Input Format
        The first argument is the integer A.
        The second argument is the long integer B.

        Output Format
        Return an array denoting the Bth permutation of length A.

        Example Input
        Input 1:

        A = 3
        B = 3

        Input 2:

        A = 1
        B = 1

        Example Output
        Output 1:

        [2, 1, 3]

        Output 2:

        [1]

        Example Explanation
        Explanation 1:

        All the permutations of length 3 sorted in lexicographical order are:
        [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1].
        Therefore, the third permutation is [2, 1, 3].

        Explanation 2:

        There is only one possible permutation -> [1].
        */

    public ArrayList<Integer> BthPermutation(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result  = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            list.add(i);
        }

        int rank = b - 1;

        for (int i = a; i >= 1; i--) {
            int factorial = factorial(i-1);
            int index = rank / factorial;
            int selected = list.get(index);

            result.add(selected);

            list.remove(index);

            rank %= factorial;
        }

        return result;
    }

    /*
        Problem Description
        
        There are A cities numbered from 1 to A. You have already visited M cities, the indices of which are given in an array B of M integers.
        If a city with index i is visited, you can visit either the city with index i-1 (i >= 2) or the city with index i+1 (i < A) if they are not already visited. Eg: if N = 5 and array M consists of [3, 4], then in the first level of moves, you can either visit 2 or 5.
        You keep visiting cities in this fashion until all the cities are not visited. Find the number of ways in which you can visit all the cities modulo 10^9+7. 


        Problem Constraints
        1 <= A <= 1000
        1 <= M <= A
        1 <= B[i] <= A


        Input Format
        The 1st argument given is an integer A, i.e total number of cities.
        The 2nd argument given is an integer array B, where B[i] denotes ith city you already visited.


        Output Format
        Return an Integer X % (1e9 + 7), the number of ways in which you can visit all the cities.


        Example Input
        A = 5
        B = [2, 5]


        Example Output
        6


        Example Explanation
        All possible ways to visit remaining cities are :
        1. 1 -> 3 -> 4
        2. 1 -> 4 -> 3
        3. 3 -> 1 -> 4
        4. 3 -> 4 -> 1
        5. 4 -> 1 -> 3
        6. 4 -> 3 -> 1

    */


    public int visitCity(int a, ArrayList<Integer> b) {

        ArrayList<Integer> city = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            city.add(i);
        }
        int i = 0, j = 0;
        while (i < city.size() && j < b.size()) {
            
            if (city.get(i).equals(b.get(j))) {
                city.remove(i);
                j++;
            } else {
                i++;
            }
        }

        return (factorial(city.size())) ;//% 10^9+7;
    }

    /*
        A robot is located at the top-left corner of an A x B grid (marked ‘Start’ in the diagram below).

        Path Sum: Example 1

        The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).

        How many possible unique paths are there?

        Note: A and B will be such that the resulting answer fits in a 32 bit signed integer.

        Example :

        Input : A = 2, B = 2
        Output : 2

        2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
                    OR  : (0, 0) -> (1, 0) -> (1, 1)

    */

    private int grid(int A, int B, int i, int j) {
        if (i >= A || j >= B) {
            return 0;
        }
        if (i == A-1 && j == B-1) {
            return 1;
        }

        return grid(A, B, i+1, j) + grid(A, B, i, j+1);
    }
    
    public int gridWays(int A, int B) {
        
        return grid(A, B, 0, 0);
    }    

    /*
    Problem Description
 
 
        Given a set of digits (A) in sorted order, find how many numbers can be formed using these digits such that its length is B and whose value is less than the number C.

        NOTE: All numbers can only have digits from the given set. 
        Problem Constraints
        0 <= |A| <= 10
        1 <= B <= 9
        0 <= C <= 1e9
        0 <= A[i] <= 9
        Input Format
        The first argument is an integer array A.
        The second argument is an integer B.
        The third argument is an integer C.
        Output Format
        Return an integer.
        Example Input
        Input 1:

        A = [0, 1, 5]
        B = 1
        C = 2

        Input 2:

        A = [0, 1, 2, 5]
        B = 2
        C = 21
        Example Output
        Output 1:

        2

        Output 2:
        5
        Example Explanation
        Explanation 1:

        0 and 1 are possible 

        Explanation 2:

        10, 11, 12, 15, 20 are possible


        public class Solution {
            public int solve(ArrayList<Integer> A, int B, int C) {
            }
        }

        Set<Integer> number = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)) {
                continue;
            }

            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }

                int digit = list.get(i) * 10 + list.get(j);
                number.add(digit);
            }
        }
        return number;

    */

    public String listTonumber(ArrayList<Integer> list) { 
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        

        return sb.toString();
    }

    /*
        Problem Description
 
            Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in matrix A. 

            This matrix A has the following properties:

                Integers in each row are sorted from left to right.
                The first integer of each row is greater than or equal to the last integer of the previous row.

            Return 1 if B is present in A, else return 0.

            NOTE: Rows are numbered from top to bottom, and columns are from left to right.


            Problem Constraints

            1 <= N, M <= 1000

            1 <= A[i][j], B <= 106

            Input Format

            The first argument given is the integer matrix A.

            The second argument given is the integer B.

            Output Format

            Return 1 if B is present in A else, return 0.

            Example Input

            Input 1: 

            A = [ 
                [1,   3,  5,  7]
                [10, 11, 16, 20]
                [23, 30, 34, 50]

                ]
            B = 3

            Input 2:

            A = [

                [5, 17, 100, 111]
                [119, 120, 127, 131]

                ]
            B = 3

            Example Output

            Output 1: 

            1

            Output 2:

            0

            Example Explanation

            Explanation 1: 

            3 is present in the matrix at A[0][1] position so return 1.

            Explanation 2:

            3 is not present in the matrix so return 0.

    */

    public ArrayList<Integer> matrixToArray(ArrayList<ArrayList<Integer>> list) {
        ArrayList<Integer> List = new ArrayList<>();
        for (ArrayList<Integer> row : list) {
            List.addAll(row);
        }

        return List;
    }

    public int binarySearch(ArrayList<ArrayList<Integer>> List, int target) {
        
        ArrayList<Integer> list = matrixToArray(List);

        int st = 0;
        int en = (list.size()-1);

        while (st <= en) {
            int mid = (st + ((en - st)/2));

            if (list.get(mid) == (target)) {
                return 1;
            }  else if (list.get(mid) < target) {
                st = mid+1;
            } else {
                en = mid - 1;
            }
        }

        return 0;
        
    }

    /*
    Problem Description
 
 

            Given a sorted array of integers A(0 based index) of size N, find the starting and the ending position of a given integer B in array A.

            Your algorithm's runtime complexity must be in the order of O(log n).

            Return an array of size 2, such that the first element = starting position of B in A and the second element = ending position of B in A, if B is not found in A return [-1, -1].

            Problem Constraints

            1 <= N <= 106

            1 <= A[i], B <= 109

            Input Format

            The first argument given is the integer array A.

            The second argument given is the integer B.


            Output Format

            Return an array of size 2, such that the first element = starting position of B in A and the second element = the ending position of B in A if B is not found in A return [-1, -1].


            Example Input

            Input 1:

            A = [5, 7, 7, 8, 8, 10]
            B = 8

            Input 2:

            A = [5, 17, 100, 111]
            B = 3

            Example Output

            Output 1:

            [3, 4]

            Output 2:

            [-1, -1]

            Example Explanation

            Explanation 1:

            The first occurence of 8 in A is at index 3.
            The second occurence of 8 in A is at index 4.
            ans = [3, 4]

            Explanation 2:

            There is no occurence of 3 in the array.
    */

    public ArrayList<Integer> arraySearch(ArrayList<Integer> list, int target) {
        ArrayList<Integer> range = new ArrayList<>();
        range.add(BinarySearch(list, target, true));
        range.add(BinarySearch(list, target, false));

        return range;
    }

    public int BinarySearch(ArrayList<Integer> list, int target, boolean value) {
        int st = 0; 
        int en = list.size()-1;
        int ans = -1;
        while (st <= en) {
            int mid = st + (en - st)/2;
            if (list.get(mid) < target) {
                st = mid+1;
            } else if (list.get(mid) > target) {
                en = mid-1;
            } else {
                ans = mid;

                if (value) {
                    en = mid-1;
                } else {
                    st = mid+1;
                }
            }
            
        }

        return ans;
    }

    /*
        Problem Description

        Given a sorted array A and a target value B, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

        You may assume no duplicates in the array.

        Problem Constraints

        1 <= |A| <= 100000

        1 <= B <= 109

        Input Format

        First argument is array A.

        Second argument is integer B.
        Output Format

        Return an integer, the answer to the problem.

        Example Input

        Input 1:

        A = [1, 3, 5, 6]
        B = 5

        Input 2:

        A = [1, 3, 5, 6]
        B = 2

        Example Output

        Output 1:
        2
        Output 2:
        1

        Example Explanation

        Explanation 1:

        5 is found at index 2.

        Explanation 2:

        2 will be inserted ar index 1.

    */
    
    public int insertTarget(ArrayList<Integer> list, int target) {
        int st = 0;
        int en = list.size()-1;

        while (st <= en) {
            int mid = st + (en-st)/2;

            if (list.get(mid).equals(target)) {
                return mid;
            }   else if (list.get(mid) < target) {
                st = mid+1;
            }   else {
                en = mid -1;
            }
        }

        return st;
    }

    /*
        Problem Description

        A conveyor belt has packages that must be shipped from one port to another within B days.

        The ith package on the conveyor belt has a weight of A[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

        Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within B days.

        Problem Constraints
        1 <= B <= |A| <= 5 * 105
        1 <= A[i] <= 105

        Input Format

        First argument is array of integers A denoting the weights.

        Second argument is the integer B denoting the number of days. 

        Output Format
        Return the least weight capacity of the ship.


        Example Input
        Input 1:

        A = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        B = 5

        Input 2:

        A = [3, 2, 2, 4, 1, 4]
        B = 3

        Example Output
        Ouput 1:

        15

        Ouput 2:

        6

        Example Explanation
        Explanation 1:

        A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
        1st day: 1, 2, 3, 4, 5
        2nd day: 6, 7
        3rd day: 8
        4th day: 9
        5th day: 10
        Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and 
        splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

        Explanation 2:

        A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
        1st day: 3, 2
        2nd day: 2, 4
        3rd day: 1, 4
    */

    /*
        Minimum possible capacity
        maximum possible capacity
        Try a capacity
        count required days
        if days <= B -> capacity works
        otherwise increase capacity
    */

    public boolean packageCapacity(ArrayList<Integer> list, int days, int capacity) {
        int currentWeight = 0;
        int requiredDays = 1;

        for (int li : list) {
            if (currentWeight + li > capacity) {
                requiredDays++;
                currentWeight = li;

                if (requiredDays > days) {
                return false;
                }
            }   else {

                currentWeight += li;
            }
        }

        return true;
    }

    public int binarySack(ArrayList<Integer> list, int days) {
        int st = Integer.MIN_VALUE;
        int en = 0;

        for (int li : list) {
            st = Math.max(st, li);
            en += li;
        }

        while (st < en) {
            int mid = st + (en-st)/2;

            if (packageCapacity(list, days, mid)) {
                en = mid;
            } else {
                st = mid+1;
            }
        }

        return st;
    }

    /*
        Problem Description
 
        Given a matrix of integers A of size N x M in which each row is sorted.

        Find and return the overall median of matrix A.

        NOTE: No extra memory is allowed.

        NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.


        Problem Constraints

        1 <= N, M <= 10^5

        1 <= N*M <= 10^6

        1 <= A[i] <= 10^9

        N*M is odd


        Input Format

        The first and only argument given is the integer matrix A.


        Output Format

        Return the overall median of matrix A.


        Example Input

        Input 1: 

        A = [   [1, 3, 5],
                [2, 6, 9],
                [3, 6, 9]   ] 

        Input 2: 

        A = [   [5, 17, 100]    ]

        Example Output

        Output 1: 

        5 

        Output 2: 

        17

        Example Explanation

        Explanation 1: 

        A = [1, 2, 3, 3, 5, 6, 6, 9, 9]
        Median is 5. So, we return 5. 

        Explanation 2:

        Median is 17.
    */

    public int matrixMedian(ArrayList<ArrayList<Integer>> list) {
        int n = list.size();
        int m = list.get(0).size();

        int st = Integer.MAX_VALUE;
        int en = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = Math.min(st, list.get(i).get(0));
            en = Math.max(en, list.get(i).get(m-1));
        }

        int desiredCount = (n*m)/2;

        while (st <= en) {
            int mid = st + (en-st)/2;

            int count = 0;
            for (int i = 0; i < n; i++) {
                count += upperBound(list.get(i), mid);
            }

            if (count <= desiredCount) {
                st = mid+1;
            } else {
                en = mid-1;
            }
        }
        // for each mid value count how many numbers in the entire matrix are less than or equal to mid

        // Adjust search range based on whether that count is less than or greater than than the required median position.

        return st;
    }

    private int upperBound(ArrayList<Integer> list, int target) {
        int st = 0;
        int en = list.size()-1;
        int ans = list.size();

        while (st <= en) {
            int mid = st + (en-st)/2;

            if (list.get(mid) > target) {
                ans = mid;
                en = mid-1;
            } else {
                st = mid+1;
            }
        }

        return ans;
    }

    /*
        Problem Description
        
        Given an integer A.

        Compute and return the square root of A.

        If A is not a perfect square, return floor(sqrt(A)).

        DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY.

        NOTE: Do not use sort function from standard library. Users are expected to solve this in O(log(A)) time.

        Problem Constraints
        0 <= A <= INTMAX

        Input Format

        The first and only argument given is the integer A.


        Output Format

        Return floor(sqrt(A))


        Example Input

        Input 1:

        11

        Input 2:

        9

        Example Output

        Output 1:

        3

        Output 2:

        3

        Example Explanation

        Explanation:

        When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
        When A = 9 which is a perfect square of 3, so we return 3.
    */

    public int sqrt(int n) {

        return (int)Math.floor(Math.sqrt(n));
    }

    /*
            Problem Description
        
        
        Given an array of integers A of size N and an integer B.

        The College library has N books. The ith book has A[i] number of pages.

        You have to allocate books to B number of students so that the maximum number of pages allocated to a student is minimum.

            A book will be allocated to exactly one student.
            Each student has to be allocated at least one book.
            Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.

        Calculate and return that minimum possible number.

        NOTE: Return -1 if a valid assignment is not possible.

        Problem Constraints

        1 <= N <= 105
        1 <= A[i], B <= 105

        Input Format

        The first argument given is the integer array A.
        The second argument given is the integer B.

        Output Format

        Return that minimum possible number.

        Example Input
        Input 1:

        A = [12, 34, 67, 90]
        B = 2

        Input 2:

        A = [5, 17, 100, 11]
        B = 4

        Example Output
        Output 1:

        113

        Output 2:

        100

        Example Explanation
        Explanation 1:

        There are two students. Books can be distributed in following fashion : 
        1)  [12] and [34, 67, 90]
            Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
        2)  [12, 34] and [67, 90]
            Max number of pages is allocated to student 2 with 67 + 90 = 157 pages 
        3)  [12, 34, 67] and [90]
            Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
            Of the 3 cases, Option 3 has the minimum pages = 113.

            bool isPos(int barier,vector<int> &A,int B ){
                int n =  A.size();
                int currSt = 1, pges = 0;
                for(int i=0; i<n; i++){
                    if(A[i] > barier) return false;
                    if(A[i] + pges > barier){
                        currSt++;
                        pges = A[i];
                        if(currSt > B){
                            return false;
                        }
                    }
                    else{
                        pges += A[i];
                    }
                }
                return true;
            }

    int Solution::books(vector<int> &A, int B) {
    
        int n = A.size();
        int sum = 0;
        for(int i=0; i<n ;i++){
            sum += A[i];
        }
        int l = A[0];
        int h = sum, ans=-1;
        if(B>n)return -1;
        while(l <= h){
            int mid = (l+h)>>1;
            if(isPos(mid, A, B)){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    */

    public boolean isPossible(ArrayList<Integer> list, int target, int capacity) {

        int currSt = 1, pgs = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > capacity) {
                return false;
            }

            if (list.get(i) + pgs > capacity) {
                currSt++;
                pgs = list.get(i);

                if (currSt > target) {
                    return false;
                }
            } else {
                pgs += list.get(i);
            }
        }

        return true;
        
    }

    public int bookDistribution(ArrayList<Integer> list, int B) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int st = list.get(0);
        int en = sum;
        int ans = -1;

        if (B > list.size()) {
            return -1;
        }

        while (st <= en) {
            int mid = st + (en-st)/2;

            if (isPossible(list, B, mid)) {
                ans = mid;
                en = mid-1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    /*
        Problem Description
 
 

        Given 2 integers A and B and an array of integers C of size N. Element C[i] represents the length of ith board.
        You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time to paint 1 unit of the board.
        Calculate and return the minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of the board.

        NOTE: 
        1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
        2. A painter will only paint contiguous boards. This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.

        Return the ans % 10000003.


        Problem Constraints

        1 <= A <= 1000

        1 <= B <= 106

        1 <= N <= 105

        1 <= C[i] <= 106


        Input Format

        The first argument given is the integer A.

        The second argument given is the integer B.

        The third argument given is the integer array C.


        Output Format

        Return minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of board % 10000003.


        Example Input

        Input 1:

        A = 2
        B = 5
        C = [1, 10]

        Input 2:

        A = 10
        B = 1
        C = [1, 8, 11, 3]



        Example Output

        Output 1:

        50

        Output 2:

        11



        Example Explanation

        Explanation 1:

        Possibility 1:- One painter paints both blocks, time taken = 55 units.
        Possibility 2:- Painter 1 paints block 1, painter 2 paints block 2, time take = max(5, 50) = 50
        There are no other distinct ways to paint boards.
        ans = 50 % 10000003

        Explanation 2:

        Each block is painted by a painter so, Painter 1 paints block 1, painter 2 paints block 2, painter 3 paints block 3 
        and painter 4 paints block 4, time taken = max(1, 8, 11, 3) = 11
        ans = 11 % 10000003
    */

    public boolean isPaint(ArrayList<Integer> list, int painters, int B, long maxTime) {

        int painterCount = 1;
        long currTime = 0;

        for (int li : list) {
            long boardTime = (long) li * B;

            if (boardTime > maxTime) {
                return false;
            }
            if (currTime + boardTime <= maxTime) {
                currTime += boardTime;
            } else {
                painterCount++;
                currTime = boardTime;

                if (painterCount > painters) {
                    return false;
                }
            }
        }

        


        return true;
    }
    
    public long paintBoard(int A, int B, ArrayList<Integer> list) {
        long st = 0;
        long en = 0;
        long minTime = Integer.MAX_VALUE;
        for (int li : list) {
            long time = (long) li * B;

            st = Math.max(st, time);

            en += time;
        }

        while (st <= en) {
            long mid = st + (en-st)/2;

            if (isPaint(list, A, B, mid)) {
                minTime = Math.min(minTime, mid);
                en = mid-1;
            } else {
                st = mid+1;
            }
        }

        return minTime;
    }

    /*
        Problem Description
        
        There are many people who believe that the earth is flat and NASA is a scam. They call themselves Flat Earthers. They were already worried that the 6 feet social distancing rule might push some people out of the earth.

        Now, they decided to think about a new issue. Since the earth is flat ( or so they think), let's imagine it as an infinite 2D grid. They have the coordinates of certain points which are orange zones and have some COVID-19 cases reported. Now each day the orange zones become more fatal. After d days, all the locations within a euclidean distance of d of a particular orange zone can be affected by this zone.

        They know N orange zones, each of whose coordinates are given by (A[i][0], A[i][1]). Now, a location is considered a red zone if it is affected by at least B orange zones. You need to find the first day at which the first red zone is reported.

        Problem Constraints

        2 <= B <= N <= 100

        0 <= A[i][0], A[i][1] <= 109

        Input Format

        The first argument contains a 2D array A of size N, denoting the coordinates of the orange zones.

        The second argument contains an integer B.

        Output Format

        Return the first day at which the first red zone is reported.


        Example Input


        Input 1:

        A : 
        [
            [8, 5]
            [0, 4]
            [3, 6]
        ]
        B : 3

        Input 2:

        A : 
        [
            [2, 3]
            [9, 4]
            [10, 3]
        ]
        B : 2

        Example Output

        Output 1:

        5

        Output 2:

        1

        Example Explanation


        Explanation 1:

        One of the red zones will be (5, 4) and it is within a distance of 5 from all the orange zones.

        Explanation 2:

        One of the red zones will be (9, 3) and it is within a distance of 1 from 2 orange zones.

    */

    /*
    Problem Description
 
        
        Implement pow(x, n) % d.
        In other words, given x, n and d,
        Find (xn % d)
        Note that remainders on division cannot be negative. In other words, make sure the answer you return is non-negative integer.


        Problem Constraints
        -109 <= x <= 109
        0 <= n <= 109
        1 <= d <= 109


        Example Input
        Input 1:

        x = 2
        n = 3
        d = 3

        Input 2:

        x = 5
        n = 2
        d = 6



        Example Output
        Output 1:

        2

        Output 2:

        1



        Example Explanation
        Explanation 1:

        23 % 3 = 8 % 3 = 2.

        Explanation 2:

        52 % 6 = 25 % 6 = 1.
    
    */
}



public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumbers pl = new PrimeNumbers();
        
        System.out.println((int)(Math.pow(2,3))%3);
        
        sc.close();

        
    }
}
