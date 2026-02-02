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
    
    
}



public class Codes {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        Structures sr = new Structures();

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("The Inversions are: " + sr.InversionCount(arr));

        
        
        sc.close();
    }
}
