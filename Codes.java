import java.util.*;
import java.util.Queue;

/*
    
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

    public boolean isbitPower(int n) {

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
*/

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

    public int BinarySearch(int[] arr, int left, int right, int target) {

        int n = arr.length;
        left = 0; right = n-1;
        

        while (left <= right) {
            int mid = right + (left - right)/2;

           if (target == arr[mid])
           {
                return mid;
           }
           else if (target > arr[mid])
           {
                left = mid+1;
           }
           else
           {
                right = mid -1;
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

    public int length(String str) {

        
        // if (str.length() == 0)
        // {
        //     return 0;
        // }

        // return length(str.substring(1))+1;
        int i = 0;
        try {

            while (true)
        {
            str.charAt(i);
            i++;
        }
            
        } catch (Exception e) {
           return i;
        }
        
    }

    public void printSubStrings(String str, int i, int j) {

        if (i == str.length())
        {
            return;
        }

        if (j > str.length())
        {
            printSubStrings(str, i+1, i+1);
            return;
        }

        System.out.print(str.substring(i, j)+" ");
        printSubStrings(str, i, j+1);
    }

    public void MatchStrings(String str) {

        int match = 0;

        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i+1; j <= str.length(); j++)
            {
                char first = str.charAt(i);
                char last = str.charAt(j-1);
                
                if (first == last)
                {
                    match++;
                }
            }
        }

        System.out.println(match);
    }

    public int MatchSubStrings(String str, int i, int j, int n) {

        if (n == 1)
        {
            return 1;
        }
        if (n <= 0)
        {
            return 0;
        }

        int match = MatchSubStrings(str, i+1, j, n-1) - MatchSubStrings(str, i+1, j-1, n-2) + MatchSubStrings(str, i, j-1, n-1);

        if (str.charAt(i) == str.charAt(j))
        {
            match++;
        }

        return match;
    }

    public void MergeSort(int[] arr, int si, int ei) {

        if (ei <= si)
        {
            return;
        }
        int mid = si + (ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
    }

    public void Merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei)
        {
            if (arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k++] = arr[i++]; 
        }
        while (j <= ei)
        {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k<temp.length; k++,i++)
        {
            arr[i] = temp[k];
        }

    }

    public void QuickSort(int[] arr, int si, int ei) {
        

        if (si >= ei)
        {
            return;
        }
        int pidx = Partition(arr, si, ei);

        QuickSort(arr, si, pidx-1);
        QuickSort(arr, pidx+1, ei);

    }

    public int Partition(int[] arr, int si, int ei) {

        int i = si-1;
        int pivot = arr[ei];

        for (int j = si; j < ei; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        

        return i;
    }

    public void TowerofHanoi(int n, String src, String helper, String dest) {

        if (n == 1) 
        {
            System.out.println("transfer disk "+n + " from "+ src + " to "+ dest);
            return;
        }

        // n - 1 disks -> transfer from A to B using C

        TowerofHanoi(n-1, src, dest, helper);

        // n disk -> transfer from A to C

        System.out.println("transfer disk "+n + " from "+ src + " to "+ dest);

        // n-1 disks -> transfer from B to C using A

        TowerofHanoi(n-1, helper, src, dest);
    }

    public String[] StringMergeSort(String[] arr, int lo, int hi) {

        if (lo == hi)
        {
            String[] A = { arr[lo]};
            return A;
        }

        int mid = lo + (hi-lo)/2;

        String[] arr1 = StringMergeSort(arr, lo, mid);
        String[] arr2 = StringMergeSort(arr, mid+1, hi);
        String[] arr3 = Merge(arr1, arr2);

        return arr3;
    }

    public String[] Merge(String[] arr1, String[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        String[] temp = new String[m+n];

        int i = 0; 
        int j = 0;
        int k = 0; 

        while (i < m && j < n)
        {
            if (isAlphabetticallySmaller(arr1[i], arr2[j]))
            {
                temp[k] = arr1[i];
                i++;
            }
            else
            {
                temp[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < m)
        {
            temp[k++] = arr1[i++];
        }

        while (j < n)
        {
            temp[k++] = arr2[j++];
        }

        return temp;
    }

    public boolean isAlphabetticallySmaller(String str1, String str2) {

        if (str1.compareTo(str2) < 0)
        {
            return true;
        }

        return false;
    }

    public int repeatedNumber(final int[] A) {
        int n = A.length;
        for (int i = 0; i < n; ++i)
        {
            int idx = Math.abs(A[i]) - 1;

            if (A[idx] < 0)
            {
                return idx + 1;
            }
            
            A[idx] = -A[idx];
        }
        return -1;
    }

    public int FindMajority(int[] arr) {

        int n = arr.length;
        
        int count = 0;
        int candidate = 0;
        int majority = 0;

        for (int i = 0; i < n; i++)
        {
            

            if (count == 0)
            {
                candidate = arr[i];
            }
            if (arr[i] == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == candidate)
            {
                majority++;
            }

            if (majority > n/2)
            {
                return arr[i];
            }
        }


        
        return -1;

        // for (int i = 0; i < n; i++)
        // {
        //     int count = 0;
        //     for (int j = 0; j < n; j++)
        //     {
        //         if (arr[i] == arr[j])
        //         {
        //             count++;
        //         }
        //     }

        //     if (count > majority)
        //     {
        //         return arr[i];
        //     }
        // }
    }

    public int InversionCount(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    count++;
                }
            }
        }

        return count;
    }
    
    public int InverseMerge(int[] arr, int si, int mid, int ei) {

        int i = si;
        int j = mid+1;
        int k = 0;
        int invCount = 0;
        int[] temp = new int[ei-si+1];

        while (i <= mid && j <= ei)
        {
            if (arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
                invCount += mid-i+1;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k++] = arr[i++];
        }
        while (j <= ei)
        {
            temp[k++] = arr[j++];
        }

        for (k = 0, i= si; k < temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }

        return invCount;
    }

    public int InverseMergeSort(int[] arr, int si, int ei) {

        int invCount = 0;
        if (si < ei)
        {
            int mid = (si+ei)/2;
        
            invCount = InverseMergeSort(arr, si, mid);
            invCount += InverseMergeSort(arr, mid+1, ei);
            invCount += InverseMerge(arr, si, mid, ei);
        }

        return invCount;
    }

    public int getInverseCount(int[] arr) {
        int n = arr.length;

        return InverseMergeSort(arr,0,n-1);
    }

    public void PrintArray(int[] arr) {

        System.out.print("The Primary Array is: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

    public void ArrayChange(int[] arr, int i, int value) {

        if (i == arr.length)
        {
            PrintArray(arr);
            return;
        }

        arr[i] = value;
        ArrayChange(arr, i+1, value+1);
        arr[i] = arr[i] - 2;
    }

    public void findSubsets(String str, int i,String ans) {

        if (i == str.length())
        {
            if (ans.length() == 0)
            {
                System.out.print("null");
            }
            else
            {
                System.out.print(ans+" ");
            }
            return;
        }

        findSubsets(str,  i+1, ans+str.charAt(i));
        findSubsets(str, i+1, ans);
    }

    public void printPermutation(String str, String ans) {

        if (str.length() == 0)
        {
            System.out.print(ans+" ");
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);

            printPermutation(newStr, ans+curr);
        }
    }

    public void printBoard(char[][] board) {
        System.out.println("---------Chess Board --------");
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {

        // Vertical Up.

        for (int i = row - 1; i >= 0; i--)
        {
            if (board[i][col] == 'Q')
            {
                return false;
            }
        }

        // left diagonal up.

        for (int i = row-1, j = col-1; i >= 0 &&j >= 0; i--,j--)
        {
            if (board[i][j] == 'Q')
            {
                return false;
            }
        }

        // right diagonal up.

        for (int i = row -1, j = col+1; i >= 0 && j < board.length; i--,j++)
        {
            if (board[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;
    }

    public void nQueens(char[][] board, int i) {

        if (i == board.length)
        {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++)
        {
            if (isSafe(board, i, j))
            {
                board[i][j] = 'Q';
                nQueens(board, i+1);
                board[i][j] = 'x';
            }
        }
    }

    public int gridWays(int i, int j, int n, int m) {

        if (i == n-1 && j == m-1)
        {
            return 1;
        }
        else if (i == n || j == m)
        {
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1+w2;
    }

    // Arraylist Implementations 

    public void arrayList(ArrayList<Integer> list, int idx1, int idx2) {

    
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public int storedWater(ArrayList<Integer> height) {

        int maxWater = 0;

        for (int i = 0; i < height.size(); i++)
        {
            for (int j = i+1; j < height.size(); j++)
            {
                int ht = Math.min(height.get(i), height.get(j));
                int wt = j-i;
                int water = ht * wt;
                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    public int sum(int k) {

        int[] arr = {1, 2, 3, 4, 5};

        if (k > arr.length)
        {
            return -1;
        }
        int sum = 0;

        for (int i = 0; i < k; i++)
        {
            sum += arr[i];
        }

        int windowSum = sum;

        for (int i = k; i < arr.length; i++)
        {
            
            windowSum = windowSum - arr[i-k] + arr[i];
        }

        return windowSum;
    }

    public int optimalStoreWater(ArrayList<Integer>height) {

        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp <= rp)
        {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wdth = rp-lp;
            int currWater = ht * wdth;
            maxWater = Math.max(maxWater, currWater);

            if (lp < rp)
            {
                lp++;
            }
            else
            {
                rp--;
            }
            
        }

        return maxWater;
    }

    public boolean pairSum(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i+1; j < list.size(); j++)
            {
                if (list.get(i)+list.get(j) == target)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean optimalPairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while (lp != rp) 
        {
            if (list.get(lp) + list.get(rp) == target)
            {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }

        return false;
    }

    public boolean pairSum1(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        for (int i = 0; i < list.size()-1; i++)
        {
            if (list.get(i) > list.get(i+1))
            {
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while (lp != rp) 
        {
            if (list.get(lp) + list.get(rp) == target)
            {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target)
            {
                lp = (lp+1) % n;
            }
            else
            {
                rp = (n + rp -1) % n;
            }
        }

        return false;
    }

    public boolean gridWays(int[][] maze, int i, int j) {

        int n = maze.length;
        int m = maze[0].length;
        int[][] ans = new int[n][m];
        while (i <= n-1 && j <= m-1)
        {
            if (maze[i][j+1] == 1)
            {
                ans[i][j] = maze[i][j+1];
            }
            else if (maze[i+1][j] == 1)
            {
                j++;
            }
            else if (maze[i+1][j+1] == 1)
            {
                i++;
                j++;
            }
            else 
            {
                i--;
                j--;
            }
        }
        
        return false;
    }

    public void printSOlution(int[][] sol) {

        for (int i = 0; i < sol.length; i++)
        {
            for (int j = 0; j < sol.length; j++)
            {
                System.out.print(" " + sol[i][j] + " ");
            }

            System.out.println();
        }
    }

    public boolean isSafe(int[][] maze, int x, int y) {

        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public boolean solveMaze(int[][] maze) {

        int n = maze.length;
        int[][] sol = new int[n][n];

        if (solveMazeUtil(maze, 0, 0, sol) == false)
        {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSOlution(sol);
        return true;
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

    /*----------------------------------Linked List------------------------------------*/

    // public Node head;
    // public Node tail;
    // public int size;

    // public void addFirst(int data) {

    //     Node newNode = new Node(data);
    //     size++;

    //     if (head == null)
    //     {
    //         head = tail = newNode;
    //         return;
    //     }

    //     newNode.next = head;

    //     head = newNode;
    // }

    // public void addLast(int data) {
        
    //     Node newNode = new Node(data);
    //     size++;

    //     if (head == null)
    //     {
    //         head = tail = newNode;
    //         return;
    //     }

    //     tail.next = newNode;
    //     tail = newNode;
    // }

    // public void print() {

    //     Node temp = head;

    //     if (head == null)
    //     {
    //         System.out.println("Linked List is empty.");
    //         return;
    //     }

    //     while (temp != null)
    //     {
    //         System.out.print(temp.data + "<->");
    //         temp = temp.next;
    //     }
    //     System.out.println("null");
    // }

    // public void add(int index, int data) {
    //     if (index == 0)
    //     {
    //         addFirst(data);
    //         return;
    //     }

    //     Node newNode = new Node(data);
    //     size++;
    //     Node temp = head;
    //     int i = 0;

    //     while (i < index-1)
    //     {
    //         temp = temp.next;
    //         i++;
    //     }

    //     newNode.next = temp.next;
    //     temp.next = newNode;
    // }

    // public int remove() {
    //     if (size == 0)
    //     {
    //         System.out.println("The list is empty to remove anything.");
    //         return Integer.MIN_VALUE;
    //     }
    //     else if (size == 1)
    //     {
    //         int value = head.data;
    //         head = tail = null;
    //         size = 0;
    //         return value;
    //     }
    //     int value = head.data;
    //     head = head.next;
    //     size--;

    //     return value;
    // }

    // public int searchKey(int target) {

    //     Node temp = head;
    //     int i = 0;

    //     while (temp != null)
    //     {
    //         if (temp.data == target)
    //         {
    //             return i;
    //         }

    //         temp = temp.next;
    //         i++;
    //     }

    //     return -1;
    // }

    // public int assist(Node head, int target) {

    //     if (head == null)
    //     {
    //         return -1;
    //     }
    //     if (head.data == target)
    //     {
    //         return 0;
    //     }

    //     int index = assist(head.next, target);
        
    //     if (index == -1)
    //     {
    //         return -1;
    //     }

    //     return index+1;

    // }

    // public int recSearchkey(int target) {
    //     return assist(head, target);
    // }

    // public void reverse() {

    //     Node prev = null;
    //     Node curr = tail = head;
    //     Node next;

    //     while (curr != null)
    //     {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     head = prev;
    // }

    // public void removeNthfromEnd(int n) {

    //     int size = 0;
    //     Node temp = head;
        
    //     while (temp != null)
    //     {
    //         temp = temp.next;
    //         size++;
    //     }

    //     if (n == size)
    //     {
    //         head = head.next;
    //         return;
    //     }

    //     int i = 1;
    //     int j = size - n;
    //     Node prev = head;

    //     while (i < j)
    //     {
    //         prev = prev.next;
    //         i++;
    //     }
    //     prev.next = prev.next.next;
    //     return;
    // }

    // public Node findMid(Node head) {

    //     Node slow = head;
    //     Node fast = head;

    //     while (fast != null && fast.next != null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     return slow;
    // }


    // public boolean checkPalindrome() {

    //     // Edge case
    //     if (head == null || head.next == null)
    //     {
    //         return true;
    //     }

    //     // find the middle Node

    //     Node midNode = findMid(head);

    //     // Reverse the 2nd half

    //     Node prev = null;
    //     Node curr = midNode;
    //     Node next;

    //     while (curr != null)
    //     {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     Node left = head;
    //     Node right = prev;

    //     while (right != null)
    //     {
    //         if (left.data != right.data)
    //         {
    //             return false;
    //         }
    //         left = left.next;
    //         right = right.next;
    //     }

    //     return true;
    // }

    // public void setHead(Node head) {
    //     this.head = head;
    // }

    // public boolean detectLLCycle(Node head) {

    //     if (head == null)
    //     {
    //         return false;
    //     }

    //     Node slow = head;
    //     Node fast = head;

    //     while (fast != null && fast.next != null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;

    //         if (slow == fast)
    //             {
    //                 return true; // Loop exists.
    //             }        
    //     }

    //     return false;
    // }

    // public void removeCycle(Node head) {

    //     // Detection of Cycle
    //     if (head == null)
    //     {
    //         System.out.println("Linked list is empty");
    //         return;
    //     }
    //     Node slow = head;
    //     Node fast = head;
    //     boolean cycle = false;

    //     while (fast != null && fast.next != null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;

    //         if (slow == fast) 
    //         {
    //             cycle = true;
    //             break;
    //         }
    //     }
    //     if (cycle == false)
    //     {
    //         return;
    //     }

    //     // find meeting point

    //     slow = head;
    //     Node prev = null;

    //     while (slow != fast) 
    //     {
    //         prev = fast;
    //         fast = fast.next;
    //         slow = slow.next;
    //     }

    //     prev.next = null;
    // }

    // private Node getMid(Node head) {

    //     Node slow = head;
    //     Node fast = head;

    //     while (fast.next != null && fast.next.next != null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     return slow;
    // }

    // private Node merge(Node left, Node right) {

    //     Node mergedLL = new Node(-1);
    //     Node temp = mergedLL;

    //     while (left != null && right != null)
    //     {
    //         if (left.data <= right.data)
    //         {
    //             temp.next = left;
    //             left = left.next;
    //             temp = temp.next;
    //         }
    //         else 
    //         {
    //             temp.next = right;
    //             right = right.next;
    //             temp = temp.next;
    //         }
    //     }

    //     while (left != null)
    //     {
    //         temp.next = left;
    //         left = left.next;
    //         temp = temp.next;
    //     }

    //     while (right != null)
    //     {
    //         temp.next = right;
    //         right = right.next;
    //         temp = temp.next;
    //     }

    //     return mergedLL.next;
    // }

    // public Node MergeSort(Node head) {

    //     if (head == null || head.next == null)
    //     {
    //         return head;
    //     }
    //     // mid 
    //     Node mid = getMid(head);
    //     // Left and Right Mergesort
    //     Node righthead = mid.next;
    //     mid.next = null;

    //     Node newLeft = MergeSort(head);
    //     Node newRight = MergeSort(righthead);
    //     // merge sorted left and right halves

    //     return merge(newLeft, newRight);
    // }

    // public void ZigzagLL() {

    //     // find mid node
    //     Node slow = head;
    //     Node fast = head.next;

    //     while (fast != null && fast.next != null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     Node mid = slow;
    //     // Reverse the second half
    //     Node curr = mid.next;
    //     mid.next = null;
    //     Node prev = null;
    //     Node next;

    //     while (curr != null)
    //     {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     Node left = head;
    //     Node right = prev;
    //     Node nextLeft, nextRight;
    //     // Alternate merge
    //     while (left != null && right != null)
    //     {
    //         nextLeft = left.next;
    //         left.next = right;
    //         nextRight = right.next;
    //         right.next = nextLeft;

    //         // Update

    //         right = nextRight;
    //         left = nextLeft;
    //     }
    // }

    // public void Addfirst(int data) {

    //     Node newNode = new Node(data);
    //     size++;

    //     if (head == null)
    //     {
    //         head = tail = newNode;
    //         return;
    //     }

    //     newNode.next = head;
    //     head.prev = newNode;
    //     head = newNode;
    // }

    // public int RemoveFirst() {

    //     if (head == null)
    //     {
    //         System.out.println("The Doubly Linked List is empty.");
    //         return Integer.MIN_VALUE;
    //     }

    //     if (size == 1)
    //     {
    //         int value = head.data;
    //         head = tail = null;
    //         size--;
    //         return value;
    //     }

    //     int value = head.data;
    //     head = head.next;
    //     head.prev = null;
    //     size--;
    //     return value;
    // }

    // public void Reverse() {

    //     Node curr = head;
    //     Node prev = null;
    //     Node next;

    //     while (curr != null)
    //     {
    //         next = curr.next;
    //         curr.next = prev;
    //         curr.prev = next;
    //         prev = curr;
    //         curr = next;
    //     }

    //     head = prev;
    // }

    // public Node getIntrsectionNode(Node head1, Node head2) {

    //     Node tempA = head1;
    //     Node tempB = head2;

    //     while (tempA != tempB)
    //     {
    //         if (tempA == null)
    //         {
    //             tempA = head2;
    //         }
    //         else
    //         {
    //             tempA = tempA.next;
    //         }
    //         if (tempB == null)
    //         {
    //             tempB = head1;
    //         }
    //         else 
    //         {
    //             tempB = tempB.next;
    //         }
    //     }
    //     return tempA;
    // }

    // /*------------------------------------------Stack--------------------------------------- */

    // // ArrayList Implementation of Stack

    // ArrayList<Object> list = new ArrayList<>();

    // public boolean isEmpty() {

    //     return list.size() == 0;
    // }

    // public void push(int data) {

    //     list.add(data);
    // }

    // public int pop() {

    //     int top = (int) list.get(list.size() - 1);
    //     list.remove(list.size()-1);

    //     return top;
    // }

    // public int peek() {

    //     return (int) list.get(list.size() - 1);
    // }

    // // Linked List Implementation of Stack

    // public boolean isempty() {

    //     return head == null;
    // }

    // public void Poos(int data) {
    //     Node newNode = new Node(data);

    //     if (isempty())
    //     {
    //         head = newNode;
    //         return;
    //     }

    //     newNode.next = head;
    //     head = newNode;
    // }

    // public int Poop() {

    //     if (isempty())
    //     {
    //         return -1;
    //     }

    //     int top = head.data;
    //     head = head.next;
    //     return top;
    // }

    // public int Peek() {
    //     if (isempty()) 
    //     {
    //         return -1;
    //     }

    //     return head.data;
    // }

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

    public String revString(String str) {

        Stack<Character> s = new Stack<>();
        int index = 0;

        while (index < str.length())
        {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder sb = new StringBuilder("");

        while (! s.isEmpty())
        {
            char curr = s.pop();
            sb.append(curr);
        }

        return sb.toString();
    }

    public void reverseStack(Stack<Integer> s) {

        if (s.isEmpty())
        {
            //System.out.println("Stack is empty");
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public void printStack(Stack<Integer> s) {

        while (! s.isEmpty())
        {
            System.out.println(s.pop());
        }
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
                span[i] = i+1;
            }
            else 
            {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
                s.push(i);
            }
        }
    }

    public void nextGreater(int[] arr) {

        Stack<Integer> s = new Stack<>();

        int[] nxtGreater = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--)
        {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                nxtGreater[i] = -1;
            }
            else
            {
                nxtGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++)
        {
            System.out.print(nxtGreater[i]+ " ");
        }
        System.out.println();
    }

    public boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
            {
                s.push(ch);
            }   else {

                if (s.isEmpty())
                {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']'))
                {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty())
        {
            return true;
        } else {
            return false;
        }
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
                }   else {
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

    public void maxHistogramArea(int[] arr) {

        int maxArea = 0; 
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length -1 ; i >= 0; i--)
        {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();

            }
            if (s.isEmpty())
            {
                nsr[i] = arr.length;
            }
            else
            {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for (int i = 0; i < arr.length; i++)
        {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                nsl[i] = -1;
            }
            else 
            {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        for (int i = 0; i < arr.length; i++)
        {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;

            maxArea = Math.max(currArea, maxArea);
        }

        System.out.print("The maximum are for the given histogram is: "+maxArea+" unit");
    }

    // public boolean stackPalindromecheck(Node head) {

    //     Node slow = head;
    //     boolean flag = true;

    //     Stack<Integer> s = new Stack<>();

    //     while (slow != null)
    //     {
    //         s.push(slow.data);
    //         slow = slow.next;
    //     }

    //     while (head != null)
    //     {
    //         int check = s.pop();

    //         if (head.data == check) 
    //         {
    //             flag = true;
    //         }
    //         else 
    //         {
    //             flag = false;
    //             break;
    //         }
    //         head = head.next;
    //     }

    //     return flag;
    // }

    public String SimplifyPath(String str) {

        Stack<String> s = new Stack<>();
        String res = "";
        res += "/";

        for (int i = 0; i < str.length(); i++)
        {
            String dir = "";
            while (i < str.length() && str.charAt(i) == '/')
            {
                i++;
            }

            while (i < str.length() && str.charAt(i) != '/')
            {
                dir += str.charAt(i);
                i++;
            }


            if (dir.equals("..") == true)
            {
                if (!s.isEmpty())
                {
                    s.pop();
                }
            }
            else if (dir.equals(".") == true)
            {
                continue;
            }
            else if (dir.length() != 0)
            {
                s.push(dir);
            }
        }

        Stack<String> st = new Stack<>();
        while (!s.isEmpty())
        {
            st.push(s.pop());
        }

        while (!st.isEmpty())
        {
            if (st.size() != 1)
            {
                res += (st.pop()+"/");
            }
            else
            {
                res += st.pop();
            }
        }

        return res;
    }

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

    public String SmallestnextPalindrome(String input) {

        int l = input.length();

        // check invalid input
        if (input.charAt(0) == '0')
        {
            return "-1";
        }
        // check all 9's -> return special case
        if (input.matches("9+"))
        {
            int n = Integer.parseInt(input);
            n += 2;

            return String.valueOf(n);
        }
        // Build palindrome 
        String str = "";

        for (int i = 0; i < l/2; i++)
        {
            str += input.charAt(i);
        }
        for (int i = (l-1)/2; i >= 0; i--)
        {
            str += input.charAt(i);
        }
        // Compare with input
        int inp = Integer.parseInt(input);
        int out = Integer.parseInt(str);
        String result = "";
        if (out >= inp) 
        {
            return str;
        }
        if (out < inp) 
        {
            StringBuilder sb = new StringBuilder(str);
            int s = sb.length();

            if (s % 2 == 0)
            {
                sb.setCharAt((s-1)/2, (char)(sb.charAt((s-1)/2)+1));
                sb.setCharAt((s)/2, (char)(sb.charAt((s)/2)+1));
            }
            else 
            {
                sb.setCharAt(s/2, (char)(sb.charAt((s/2))+1));
            }
            result = sb.toString();
        }
        
        return result;
    }

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

    /*-------------------------------Greedy Approaches--------------------------------------- */

    public void ActivitySelection(int[] start, int[] end) {
        // ArrayList<Integer> ans = new ArrayList<>();
        // int maxAct = 0;
        
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];

        // for (int i = 1; i < end.length; i++) 
        // {
        //     if (start[i] >= lastEnd)
        //     {
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }

        // System.out.println("Maximum Activity: "+ maxAct);
        // for (int i = 0; i < ans.size(); i++)
        // {
        //     System.out.print("A"+ans.get(i)+" ");
        // }
        // System.out.println();

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        /*Sorting Process*/
        int[][] sortedArr = new int[end.length][3];

        for (int i = 0; i < start.length; i++)
        {
            sortedArr[i][0] = i;
            sortedArr[i][1] = start[i];
            sortedArr[i][2] = end[i];
        }

        Arrays.sort(sortedArr, Comparator.comparingDouble(o -> o[2]));

        maxAct = 1;
        ans.add(sortedArr[0][0]);
        int lastEnd = sortedArr[0][2];

        for (int i = 1; i < end.length; i++)
        {
            if (sortedArr[i][1] >= lastEnd)
            {
                maxAct++;
                ans.add(sortedArr[i][0]);
                lastEnd = sortedArr[i][2];
            }
        }

        System.out.println("Maximum Activity is: "+ maxAct);
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print("A" + ans.get(i) + " ");

        }
        System.out.println();

    }

    public void fractionalKnapSack(int[] value, int[] weight, int capacity) {

        double[][] ratio = new double[value.length][2];

        for (int i = 0; i < value.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int profit = 0;
        for (int i = ratio.length-1; i >= 0; i--)
        {
            int index = (int)ratio[i][0];
            if (capacity >= weight[index])
            {
                profit += value[index];
                capacity -= weight[index];
            }
            else
            {
                profit += (ratio[i][1] * capacity);
                break;
            }
        }

        System.out.println(profit);
    }

    public void minAbsoluteDifference(int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbsDiff = 0;
        for (int i = 0; i < A.length; i++)
        {
            minAbsDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println(minAbsDiff);
    }

    public void maxLengthChainofPairs(int[][] input) {

        Arrays.sort(input, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int PairEnd = input[0][1];

        for (int i = 1; i < input.length; i++)
        {
            if (input[i][0] > PairEnd)
            {
                chainLength++;
                PairEnd = input[i][1];
            }
        }

        System.out.println(chainLength);
    }

    public void IndianCoin(Integer[] coins, int amount) {
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(coins, Comparator.reverseOrder());

        int minCoin = 0;

        for (int i = 0;i < coins.length; i++)
        {
            if (coins[i] <= amount)
            {
                while (coins[i] <= amount)
                {
                    minCoin++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("The total minimum number of coin is: "+ minCoin);

        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    /*--------------------------------Binary Trees--------------------------------------- */
    public static int idx = -1;
    public Node BuildTree(int[] nodes) {

        idx++;
       
        if (nodes[idx] == -1)
        {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = BuildTree(nodes);
        newNode.right = BuildTree(nodes);

        return newNode;
    }

    public void preOrder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void InOrder(Node root) {
        if (root == null)
        {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public void PostOrder(Node root) {
        if (root == null)
        {
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void LevelOrder(Node root) {

        if (root == null)
        {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            Node currNode = q.remove();
            if (currNode == null)
            {
                System.out.println();
                if (q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(currNode.data + " ");
                if (currNode.left != null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right != null) 
                {
                    q.add(currNode.right);
                }
            }
        }
    }

    public int treeHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int left = treeHeight(root.left);
        int right = treeHeight(root.right);

        return (Math.max(left, right) + 1);
    }

    public int treeNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = treeNodes(root.left);
        int rightNodes = treeNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public int SumOfNodes(Node root) {
        if (root == null)
        {
            return 0;
        }

        int leftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);
        

        return (leftSum + rightSum + root.data);
    }

    public int treeDiameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = treeHeight(root.left);
        int leftDiameter = treeDiameter(root.left);
        int rightHeight = treeHeight(root.right);
        int rightDiameter = treeDiameter(root.right);

        int selfDiameter = (leftHeight + rightHeight + 1);

        return (Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter)));
    }

    public Info TreeDiameter(Node root) {

        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = TreeDiameter(root.left);
        Info rightInfo = TreeDiameter(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diameter, height);
    }

    public boolean isIdentical(Node node , Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    public boolean isSubTree(Node root, Node SubRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == SubRoot.data) {
            if (isIdentical(root, SubRoot)) {
                return true;
            }
        }

        return (isSubTree(root.left, SubRoot)) || (isSubTree(root.right, SubRoot));
    }

    public void topView(Node root) {
        Queue<treeInfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        q.add(new treeInfo(root, 0));
        q.add(null);
        int min = 0, max = 0;
        while (!q.isEmpty()) {
            treeInfo curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                } 
                if (curr.node.left != null) {
                    q.add(new treeInfo(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if (curr.node.right != null) {
                    q.add(new treeInfo(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public void recursiveKthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data+ " ");
            return;
        }

        recursiveKthLevel(root.left, level+1, k);
        recursiveKthLevel(root.right, level+1, k);
    }

    public boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size()-1);

        return false;
    }

    public Node LowestCommonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        Node lca = path1.get(i-1);

        return lca;
    }

    public Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftx = lca(root.left, n1, n2);
        Node rightx = lca(root.right, n1, n2);

        if (leftx == null) {
            return rightx;
        }
        if (rightx == null) {
            return leftx;
        }

        return root;
    }

    public int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist+1;
        }
    }

    public int minNodeDist (Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1+dist2;
    }

    public int ancestor = -1;

    public int KthAncestor(Node root, int n, int k) {

        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = KthAncestor(root.left, n, k);
        int rightDist = KthAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int maxDist = Math.max(leftDist, rightDist);
        if (maxDist+1 == k) {
            ancestor = root.data;
        }
        return maxDist+1;
    }

    public int transformToSumTree(Node root) {
        if (root == null) {
            return 0;
        }
        System.out.print(root.data+" ");
        int leftChild = transformToSumTree(root.left);
        int rightChild = transformToSumTree(root.right);

        int value = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;

        return value;
    }
}

class Info {
    int diameter;
    int height;

    public Info(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}

class treeInfo {
    Node node;
    int hd;     // Horizontal Distance

    public treeInfo(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}



public class Codes {
    public static void main(String[] args) throws Exception{
        Structures ss = new Structures();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        ss.transformToSumTree(root);
        ss.preOrder(root);
        
    }
}
 