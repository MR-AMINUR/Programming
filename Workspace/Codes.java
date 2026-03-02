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

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null)
        {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data) {
        
        Node newNode = new Node(data);
        size++;

        if (head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {

        Node temp = head;

        if (head == null)
        {
            System.out.println("Linked List is empty.");
            return;
        }

        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0)
        {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index-1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int remove() {
        if (size == 0)
        {
            System.out.println("The list is empty to remove anything.");
            return Integer.MIN_VALUE;
        }
        else if (size == 1)
        {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;

        return value;
    }
}

class Node {

    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}



public class Codes {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        Structures sr = new Structures();

        
        sr.addFirst(1);
        
        sr.addFirst(2);
        
        sr.addLast(3);
        
        sr.addFirst(4);
        sr.add(2,5);
        sr.print();
        System.out.println(sr.size);
        sr.remove();
        sr.print();
        System.out.println(sr.size);
        
        sc.close();
    }
}
