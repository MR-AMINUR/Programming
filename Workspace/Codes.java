import java.util.*;

class codes {
    private void merge(@SuppressWarnings("rawtypes") Comparable[] a, @SuppressWarnings("rawtypes") Comparable[] aux, int lo, int mid, int hi) {

        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        
        assert isSorted(a, lo, hi);
    }

    private boolean isSorted(@SuppressWarnings("rawtypes") Comparable[] a, int lo, int hi) {
        throw new UnsupportedOperationException("Unimplemented method 'isSorted'");
    }

    private void sort(@SuppressWarnings("rawtypes") Comparable[] a, @SuppressWarnings("rawtypes") Comparable[] aux, int lo, int hi) {

        if (hi <= lo) return;

        int mid = lo + (hi -lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }
    @SuppressWarnings("unchecked")
    private boolean less(@SuppressWarnings("rawtypes") Comparable v, @SuppressWarnings("rawtypes") Comparable w) {

        return v.compareTo(w) < 0;
    }


    public void sort(@SuppressWarnings("rawtypes") Comparable[] a) {

        @SuppressWarnings("rawtypes")
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length-1);
    }
}

class Quick {

    private int partition(@SuppressWarnings("rawtypes") Comparable[] a, int lo, int hi) {
       
        
        int i = lo, j = hi+1;

        while (true) 
        {
            while (less(a[++i], a[lo]))
                if (i == hi)
                    break;

            while (less(a[lo], a[--j]))
                if (j == lo)
                    break;
            if (i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
        
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

    public void sort(@SuppressWarnings("rawtypes") Comparable[] a) {

       
        sort(a, 0, a.length - 1);
    }

    private void sort(@SuppressWarnings("rawtypes") Comparable[] a, int lo, int hi) {

        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
}

class Sortable {

    public int partition(int[] a, int lo, int hi) {

        int p = a[lo];
        int i = lo;
        int j = hi+1;

        while (true)
        {
            
            do {
                i++;
            } while (i <= hi && a[i] < p);
            do {
                j--;
            } while (a[j] > p);

            if (i >= j) break;

            int swap = a[i];
            a[i] = a[j];
            a[j] = swap;
        }
         int swap = a[lo];
            a[lo] = a[j];
            a[j] = swap;


        return j;
    }
}

class NutBolts {

    /*A disorganized carpenter has a mixed pile of n nuts and n bolts. The goal is to find the corresponding pairs of nuts and bolts. Each nut fits exactly one bolt and each bolt fits exactly one nut. By fitting a nut and a bolt together, the carpenter can see which one is bigger (but the carpenter cannot compare two nuts or two bolts directly). Design an algorithm for the problem that uses at most proportional to nlogncompares (probabilistically). */

    public int result(@SuppressWarnings("rawtypes") Comparable[] a, int lo, int hi) {

        int i = lo, j = hi+1;
        while (true)
        {
            while (less(a[++i], a[lo]))
            {
                if (i == hi) break;
            }
            while (less(a[lo], a[--j]))
            {
                if (j == lo) break;
            }

            if (i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    @SuppressWarnings("unchecked")
    public boolean less(@SuppressWarnings("rawtypes") Comparable v, @SuppressWarnings("rawtypes") Comparable w) {

        return v.compareTo(w) < 0;
    }

    private void exch(@SuppressWarnings("rawtypes") Comparable[] a, int i, int j) {

        @SuppressWarnings("rawtypes")
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}


class maxSubarray {

    public int[] ans(int[] a) {

        int n = a.length;

        int s = 0, e = n - 1;

        // 1. find first break from left
        while (s < n - 1 && a[s] <= a[s + 1]) {
            s++;
        }
        if (s == n - 1) return new int[]{-1, -1}; // already sorted

        // 2. find first break from right
        while (e > 0 && a[e] >= a[e - 1]) {
            e--;
        }

        // 3. find min and max inside [s..e]
        int minVal = a[s], maxVal = a[s];
        for (int i = s; i <= e; i++) {
            minVal = Math.min(minVal, a[i]);
            maxVal = Math.max(maxVal, a[i]);
        }

        // 4. expand left
        while (s > 0 && a[s - 1] > minVal) {
            s--;
        }

        // 5. expand right
        while (e < n - 1 && a[e + 1] < maxVal) {
            e++;
        }

        return new int[]{s, e};
        /* 
        int n = a.length;
        int dip = 0, peak = n-1;

        while (dip < n-1 && a[dip] <= a[dip+1])
        {
            dip++;
        }
        if (dip == n-1) return new int[]{-1, -1};

        while (peak > 0 && a[peak] >= a[peak-1])
        {
            peak--;
        }
        int min = a[dip], max = a[dip];

        for (int i = dip; i <= peak; i++)
        {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }

        while (dip > 0 && a[dip] > min)
        {
            dip--;
        }
        while (peak < n-1 && a[peak+1] < max)
        {
            peak++;
        }

        return new int[]{dip, peak};*/
    }
}

class Logs<Letter, Digit> {

    public String[] solve(String[] a) {

        //ArrayList<Letter> ltr = new ArrayList<>();
        //List<Digit> dgt = new ArrayList<>();

       // Arrays.sort(ltr);

        return a;
    }
}

class UnorderedMaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N;

    @SuppressWarnings("unchecked")
    public UnorderedMaxPQ(int capacity) {
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(Key x) {
        pq[N++] = x;
    }

    public Key delMax() {

        int max = 0;
        for (int i = 1; i < N; i++)
            if (less(max, i)) max = i;
        exch(max, N-1);

        return pq[--N];
    }

    @SuppressWarnings("unchecked")
    private boolean less(@SuppressWarnings("rawtypes") Comparable v, @SuppressWarnings("rawtypes") Comparable w) {

        return v.compareTo(w) < 0;
    }

    private void exch(int i, int j) {

        int temp = i;
        i = j;
        j = temp;
    }
}



public class Codes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        maxSubarray ms = new maxSubarray();

        //Sortable sp = new Sortable();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.print("Enter the Elements of Array: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        //System.out.println(sp.partition(a, 0, 6));
        int[] res = ms.ans(a);
        // Option 1: nice array format [s, e]
        System.out.println(Arrays.toString(res));


        sc.close();
    }
}
