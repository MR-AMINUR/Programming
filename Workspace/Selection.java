import java.util.*;

class QueueOfStacks {
    
    private Stack<String> inStack = new Stack<>();
    private Stack<String> outStack = new Stack<>();

    public boolean isEmpty() {

        return inStack.isEmpty() && outStack.isEmpty();
    }

    public void enqueue(String item) {

        inStack.push(item);
    }

    public String dequeue() {

        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {

                outStack.push(inStack.pop());
            }
        }

        if (outStack.isEmpty()) throw new RuntimeException();
        return outStack.pop();
    }
}

class MaxStack {

    private Stack<Double> mainStack;
    private Stack<Double> maxStack;

    public MaxStack() {

        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(double x) {

        mainStack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek()) 
            maxStack.push(x);
    }

    public double pop() {
        if (mainStack.isEmpty()) throw new RuntimeException();
        double val = mainStack.pop();
        if (val == maxStack.peek()) 
            maxStack.pop();
        return val;
    }

    public double max() {

        if (maxStack.isEmpty()) throw new RuntimeException();
        return maxStack.peek();
    }

    public boolean isEmpty() {

        return mainStack.isEmpty();
    }
}
class Sorting {

    @SuppressWarnings("unchecked")
    private boolean less(@SuppressWarnings("rawtypes") Comparable v, @SuppressWarnings("rawtypes") Comparable w) {

        return v.compareTo(w) < 0;
    }

    private void exch(@SuppressWarnings("rawtypes") Comparable[] a, int i, int j) {

        @SuppressWarnings("rawtypes")
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public void sort(@SuppressWarnings("rawtypes") Comparable[] a) {

        int N = a.length;

        for(int i = 0; i < N; i++) 
        {
            int min = i;

            for(int j = i+1; j < N; j++)
                if(less(a[j], a[min]))
                    min = j;
            exch(a, i, min);
           
        }
    }
}

class InSorting {

    @SuppressWarnings("unchecked")
    private boolean less(@SuppressWarnings("rawtypes") Comparable v, @SuppressWarnings("rawtypes") Comparable w ) {

        return v.compareTo(w) < 0;
    }

    private void exch(@SuppressWarnings("rawtypes") Comparable[] a, int i, int j) {

        @SuppressWarnings("rawtypes")
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public void Insort(@SuppressWarnings("rawtypes") Comparable[] a) {

        int size = a.length;

        for(int i = 0; i < size; i++)
        {
            for(int j = i; j > 0; j--)
                if(less(a[j], a[j-1]))
                    exch(a, j, j-1);
                else break;
        }
    }
}

class sQuadratic {

    public int ArrayElement(Integer[] a, Integer[] b) {

        int size = a.length;
        int count = 0;

        for(int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                    if (a[i] == b[j])
                        count++;

            }
        return count;
    }
}

class ShellSort {

    public void sSort(@SuppressWarnings("rawtypes") Comparable[] a) {

        int size = a.length;
        int h = 1;

        while (h < size/3) h = 3*h + 1;

        while (h >= 1) {

            for (int i = h; i < size; i++)
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
                    exch(a, j, j-h);

            h = h/3;
        }
    }

    @SuppressWarnings("unchecked")
    private boolean less(@SuppressWarnings("rawtypes") Comparable v, @SuppressWarnings("rawtypes") Comparable w) {

        return v.compareTo(w) < 0;
    }

    private void exch(@SuppressWarnings("rawtypes") Comparable[] a, int i, int j) {

        @SuppressWarnings("rawtypes")
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    
}

class Permutation {

    public void ArrayElement(Integer[] a, Integer[] b) {

         if (a.length != b.length) {
            System.out.println("Not a permutation.");
            return;
        }
        
        Integer[] sortedA = Arrays.copyOf(a, a.length);
        Integer[] sortedB = Arrays.copyOf(b, b.length);
        
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);
        
        if (Arrays.equals(sortedA, sortedB)) {
            System.out.println("Its Permutation.");
        } else {
            System.out.println("Not a permutation.");
        }
    }
}


class BucketPebble {
    public void color(Integer[] a) {
        int n = a.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);  
                low++;
                mid++;
            } else if (a[mid] == 1) {  
                mid++;
            } else {  
                swap(a, mid, high);
                high--;
            }
        }
    }

    private void swap(Integer[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

class ArrayMath {

    public Integer[] solve(Integer[] a) {

        int n = a.length;
        
        for (int i = n-1; i >= 0; --i)
        {
            if (a[i] < 9)
            {
                a[i]++;
                return a;
            }
            a[i] = 0;
        }
        
        Integer[] result = new Integer[n+1];
        result[0] = 1;
        return result;
    }
}

class ArrayPartition {

    public void sol(int[] arr) {

        int low = 0,  high = 0;
        int n = arr.length;
        int start = 0, end = n-1;

        for (int i =0; i <= end;)
        {
            if (arr[i] < low)
            {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            }
            else if (arr[i] > high)
            {
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }
            else 
                i++;
        }
    }
}

class contiguousArray {

    /* 
    public int binarySearch(Vector<Integer> v, int x) {

        int low = 0, high = v.size() - 1;

        while (low <= high)
        {
            int mid = (low + high)/2;

            if (v.get(mid) <= x)
                low = mid+1;
            else if (v.get(mid) > x && v.get(mid) <= x)
                return mid;
            else if (v.get(mid) > x && mid == x)
                return mid;
            else 
                high = mid-1;
        }
        return -1;
    }

    public int solution(int[] B, int A) {

        int count = 0;

        int[] prefix = new int[A];
        prefix[0] = B[0];
        for (int i = 1; i < A; i++)
            prefix[i] = prefix[i-1] + B[i];
        
        int sum = prefix[A-1];

        if (sum % 3 != 0)
            return 0;

        int[] suffix = new int[A];
        suffix[A-1] = B[A-1];
        for (int i = 1; i < A; i++)
            suffix[i] = suffix[i+1] + B[i];
        
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < A; i++)
            if (suffix[i] == sum/3)
                v.add(i);

        for (int i = 0; i < A; i++)
        {
            if (prefix[i] == sum/3)
            {
                int result = binarySearch(v, i+1);

                if (result != -1)
                    count += v.size() - result;
            }
        }

        return count;
    }*/

    public int solve(int A, int[] B) {

        int[] count = new int[A];
        int sum = 0;

        for (int i = 0; i < A; i++)
            sum += B[i];
        
        if (sum%3 != 0)
            return 0;
        
        sum /= 3;

        int sp = 0;

        for (int i = A-1; i >= 0; i--)
        {
            sp += B[i];

            if (sp == sum)
                count[i]++;
        }

        for (int i = A-2; i >= 0; i--)
            count[i] += count[i+1];

        int ans = 0;
        sp = 0;

        for (int i = 0; i+2 < A; i++)
        {
            sp += B[i];
            if (sp == sum)
                ans += count[i+2];
        }
        return ans;
    }
}

class TriangleArea {

    public void area(double a, double b, double c) {

        double s = (a+b+c)/2;
        double p = (s*(s-a)*(s-b)*(s-c));
        double area = Math.sqrt(p);

        System.out.println(area);
    }
}

class Inversion {

    public int sort(int[] a) {
        return mergeSortAndCount(a, 0, a.length - 1);
    }

    private int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) return 0;

        int mid = (left + right) / 2;
        int count = 0;

        count += mergeSortAndCount(arr, left, mid);
        count += mergeSortAndCount(arr, mid + 1, right);
        count += mergeAndCount(arr, left, mid, right);

        return count;
    }

    private int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = java.util.Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = java.util.Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left, swaps = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps += (leftArr.length - i); // all remaining left elements are inversions
            }
        }

        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];

        return swaps;
    }
}


public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TriangleArea ta = new TriangleArea();

        Inversion is = new Inversion();

        
        System.out.print("Enter the size of Array: ");
        int N = sc.nextInt();

        int[] a = new int[N];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        
        System.out.println(is.sort(a));
        

        //ta.area(34, 12, 35);
        //System.out.println();
        
        sc.close();
    }
}