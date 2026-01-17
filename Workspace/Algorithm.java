import java.util.*;



class gorithm {

    /* 

    public ArrayList<Integer> sizeset(ArrayList<Integer> A) {
        double finalSum=0;
        double tempSum=0;
        int finalSegmentLength=0;
        int tempSegmentLength=0;
       
        ArrayList<Integer> finalAnswer = new ArrayList<Integer>();
        ArrayList<Integer> tempAnswer = new ArrayList<Integer>();
       
        for(int i=0;i<A.size();i++){
            if(A.get(i)<0){
                if(tempSum>finalSum){
                    finalSum=tempSum;
                    tempSum=0;
                    finalSegmentLength=tempSegmentLength;
                    tempSegmentLength=0;
                    finalAnswer.clear();
                    for (Integer value : tempAnswer) {
                        finalAnswer.add(value);
                    }      
                    tempAnswer.clear();
                }
                else if(tempSum==finalSum){
                    if(finalSegmentLength<tempSegmentLength){
                        finalSum=tempSum;
                        tempSum=0;
                        finalSegmentLength=tempSegmentLength;
                        tempSegmentLength=0;
                        finalAnswer.clear();
                        for (Integer value : tempAnswer) {
                            finalAnswer.add(value);
                        }  
                        tempAnswer.clear();
                    }
                    else{
                        tempSum=0;
                        tempSegmentLength=0;
                        tempAnswer.clear();
                    }
                }
                else{
                    tempSum=0;
                    tempSegmentLength=0;
                    tempAnswer.clear();
                }
            }
            else{
                tempSum+=A.get(i);
                tempSegmentLength++;
                tempAnswer.add(A.get(i));
            }
        }
        if(tempSum>finalSum){
            finalAnswer.clear();
            for (Integer value : tempAnswer) {
                finalAnswer.add(value);
            }
        }
        else if(tempSum==finalSum){
            if(finalSegmentLength<tempSegmentLength){
                for (Integer value : tempAnswer) {
                finalAnswer.add(value);
                }
            }
        }
        return finalAnswer;
    }
    */
}

class Solution {

    int factorial(int n) {

        int result = 1;

        for(int i = 2; i <= n; i++)
            result *= i;
        
        return result;
    }
}

class Obstacle {

    public int factorial(int n) {

        int[] arr = new int[500];

        arr[0] = 1;
        int size = 1;

        for(int i = 2; i < n; i++)
            
            size = multiply(i, arr, size);
        
        System.out.println("Factorial of the given number is: ");
        for(int i = size - 1; i >= 0; i--)
            System.out.print(arr[i]);
        

        return n;
    } 

    public int multiply(int x, int arr[], int size) {

        int carry = 0;

        for(int i = 0; i < size; i++) {

            int pdt = arr[i] * x + carry;

            arr[i] = pdt % 10;
            carry = pdt / 10;
        }

        while(carry != 0) {

            arr[size] = carry % 10;
            carry /= 10;
            size++;

        }
        return size;
    }
}

class SlidingWindow {

    public int Sum(int k) {

        int[] arr = {1, 2, 3, 4, 5};
        //int size = arr.length;
        int sum = 0;
        
        //int left = arr[0];
        for(int i = 0; i < k; i++)
        {
            sum += arr[i];
            arr[0]++;
            for(int j = 0; j < k; j++) {
                sum +=  arr[j];
            }
        }
        return sum;
    }

}

class NobleInteger {

    public int solve(int[] p) {

        int n = p.length;

        int[] a = new int[n+1];
        Arrays.fill(a, 0);

        for (int i = 0; i < n; i++)
        {
            if (p[i] < 0) continue;

            else if (p[i] >= n)
                a[n]++;
            else
                a[p[i]]++;
        }

        int x = a[n];

        for (int i = n-1; i >= 0; i--)
        {
            if (x == i && a[i] > 0)
                return i;

            else if (x > i)
                return -1;

            x += a[i];
        }

        /* 
        Arrays.sort(a);

        for (int i = 0; i < n; i++)
        {
            if (a[i] == a[i+1]) continue;

            if (a[i] == n-i-1)
            {
                return a[i];
            }
        }

        if (a[n-1] == 0)
            return a[n-1];
        */

        return -1;
    }
}

class Distance {

    public int maxdis(int[] a) {

        int n = a.length;

        int[] leftMin = new int[n];
        leftMin[0] = a[0];

        for (int i = 1; i < n; i++)
        {
            leftMin[i] = Math.min(leftMin[i-1], a[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = a[n-1];

        for (int j = n-2; j >= 0; j--)
        {
            rightMax[j] = Math.max(rightMax[j+1], a[j]);
        }

        int i = 0, j = 0;
        int max_dis = 0;
        while (i < n && j < n)
        {
            if (leftMin[i] <= rightMax[j])
            {
                max_dis = Math.max(max_dis, j-i);
                j++;
            }
            else
                i++;
        }

        return max_dis;
        /* 
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (a[i] < min)
                min = a[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (a[i] > max)
                max = a[i];
        }

        return (max-min);
        */
    }
}

class Bookings {
    
    /* 

    public boolean solve(int[] a, int[] d, int c) {

        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(d);

        int i = 0, j = 0;
        int rn = 0;

        while (i < n && j < n)
        {
            if (a[i] < d[j])
            {
                rn++;
                if (rn > c)
                    return false;
                i++;
            }
            else if (a[i] >= d[j])
            {
                rn--;
                j++;
            }

        }
        
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {

        int n = arrive.size();

        int[] a = new int[n];
        int[] d = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = arrive.get(i);
            d[i] = depart.get(i);
        }

        Arrays.sort(a);
        Arrays.sort(d);

        int i = 0, j = 0;
        int rn = 0;
        while (i < n && j < n) 
        {
            if (a[i] < d[j])
            {
                rn++;
                if (rn > k) return false;
                i++;
            }
            else
            {
                rn--;
                j++;
            }
        }
        return true;

    }
    */
}

class maxSubarray {

    public int[] result(int[] a) {

        int n = a.length;
        int s = 0, e = n-1; // s = start e = end

        while (s < n-1 && a[s] <= a[s+1])
        {
            s++;
        }
        if (s == n-1) return new int[]{-1,-1};

        while (e > 0 && a[e] >= a[e-1])
        {
            e--;
        }

        int min = a[s], max = a[s];

        for (int i = s; i <= e; i++)
        {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }

        while (s > 0 && a[s-1] > min)
        {
            s--;
        }

        while (e < n-1 && a[e+1] < max)
        {
            e++;
        }

        return new int[]{s,e};
    }
}

class MatrixProblem {

    public void setMatrixZeroes(int[][] matrix) {

        int n = matrix.length, m = matrix[0].length;
        int c0 = 1;

        for (int i = 0; i < n; i++)
        {
            if (matrix[i][0] == 0) c0 = 0;
            for (int j = 1; j < m; j++)
            {
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
                
            }
        }

        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < m; j++)
            {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0)
        {
            for (int j = 0; j < m; j++)
            {
                matrix[0][j] = 0;
            }
        }

        if (c0 == 0)
        {
            for (int i = 0; i < n; i++)
            {
                matrix[i][0] = 0;
            }
        }

        /* 
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (matrix[i][j] == 0)
                {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (rows[i] || cols[j])
                {
                    matrix[i][j] = 0;
                }
            }
        }  */


    }
}

class MatrixSolution {

    public int sol(int[][] matrix, int k) {

        int n = matrix.length;
        int[][] psum = new int[n][n];
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                psum[i][j] = matrix[i][j];

                if (j > 0)
                {
                    psum[i][j] += psum[i][j-1];
                }
                if (i > 0)
                {
                    psum[i][j] += psum[i-1][j];
                }
                if (i > 0 && j > 0)
                {
                    psum[i][j] -= psum[i-1][j-1];
                }
            }
        }

        int ans = Integer.MIN_VALUE;

        for (int i = k-1; i < n; i++)
        {
            for (int j = k-1; j < n; j++)
            {
                int sum = psum[i][j];

                if (i >= k)
                {
                    sum -= psum[i-k][j];
                }
                if (j >= k)
                {
                    sum -= psum[i][j-k];
                }
                if (i >= k && j >= k)
                {
                    sum += psum[i-k][j-k];
                }

                ans = Math.max(ans, sum);
            }
        }
        /* 
        for (int j = 0; j < n; j++)
        {
            int sum = 0;

            for (int i = 0; i < k; i++)
            {
                sum += matrix[i][j];
            }
            psum[0][j] = sum;

            for (int i = 1; i <= n-k; i++)
            {
                sum += matrix[i+k-1][j] - matrix[i-1][j];
                psum[i][j] = sum;
            }
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i <= n-k; i++)
        {
            int sum = 0;

            for (int j = 0; j < k; j++)
            {
                sum += psum[i][j];
            }

            ans = Math.max(ans, sum);

            for (int j = 1; j <= n-k; j++)
            {
                sum += psum[i][j+k-1] - psum[i][j-1];

                ans = Math.max(ans, sum);
            }
        }*/

        /* 
        int ans = Integer.MIN_VALUE;        
        for (int i = 0; i <= n-k; i++)
        {
            for (int j = 0; j <= n-k; j++)
            {
                int sum = 0;

                for (int p = i; p < i+k; p++)
                {
                    for (int q = j; q < j+k; q++)
                    {
                        sum += matrix[p][q];
                    }
                }

                ans = Math.max(ans, sum);
            }
        }*/
        return ans;
    }

    public void solve(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public void diagonal(int[][] table) {
        int n = table.length;

        for (int col = 0; col < n; col++)
        {
            int startcol = col, startrow = 0;

            while (startcol >= 0 && startrow < n)
            {
                System.out.print(table[startrow][startcol] + " ");

                startcol--;
                startrow++;
            }
            System.out.println();
        }

        for (int row = 1; row < n; row++)
        {
            int startrow = row, startcol = n-1;

            while (startrow < n && startcol >= 0)
            {
                System.out.print(table[startrow][startcol] + " ");

                startcol--;
                startrow++;
            }
            System.out.println();
        }
    }
}

class PeakArray {

    public int soln(int[] a) {
        int n = a.length;
        
        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n-1; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], a[i-1]);
        }

        int[] rightMin = new int[n];
        rightMin[n-1] = Integer.MAX_VALUE;

        for (int j = n-2; j >= 0; j--)
        {
            rightMin[j] = Math.min(rightMin[j+1], a[j+1]);
        }

        for (int k = 0; k < n; k++)
        {
            if (a[k] > leftMax[k] && a[k] < rightMin[k])
            {
                return a[k];
            }
        }

        
        /* 
        for (int i = 0; i < n; i++)
        {
            boolean valid = true;

            for (int j = 0; j < i; j++)
            {
                if (a[j] >= a[i])
                {
                    valid = false;
                    break;
                }
            }

            for (int k = i+1; k < n; k++)
            {
                if (a[k] <= a[i])
                {
                    valid = false;
                    break;
                }
            }

            if (valid)
            {
                return a[i];
            }
        }*/

        return -1;
    }
}

class MoveElements {

    public void ans(int[] a) {

        int n = a.length;
        int k = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] != 1)
            {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                k++;
            }
        }
        
    }  
}

class EqualElements {

    public int equation(int[] a) {

        int n = a.length;

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0)+1);
        }

        int maxFreq = 0;

        for (int val : freqMap.values())
        {
            maxFreq = Math.max(maxFreq, val);

        }

        return n - maxFreq;
        /* 
        Arrays.sort(a);

        int nf = 1;     // nf = normal frequency
        int mf = 1;     // mf = maximum frequency
        for (int i = 1; i < n; i++)
        {
            if (a[i] == a[i-1])
            {
                nf++;
            }
            else
            {
                mf = Math.max(mf, nf);
                nf = 1;
            }
        }

        mf = Math.max(mf, nf);

        return n-mf;
        */
        /* 
        int minOps = n;

        for (int i = 0; i < n; i++)
        {
            int curOps = 0;
            for (int j = 0; j < n; j++)
            {
                if (a[i] != a[j])
                {
                    curOps++;
                }
            }

            minOps = Math.min(minOps, curOps);
        }
        return minOps;
        */
    }
}

class ArraySort {

    public void sort(int[] a) {

        

        //Arrays.sort(a); 
    }
}

class Pyramid {

    public void pattern(int n) {

        for (int row = 1; row <= n; row++)
        {
            for (int i = n; i >= row; i--)
            {
                System.out.print(" ");
            }
            int c = 1;

            for (int i = 1; i <= row; i++)
            {
                System.out.print(c + " ");
                c = c * (row - i)/i;
            }
            System.out.println();
        }
    }
}

class Chess {

    public int bishop(int r, int c) {

        int topleft = Math.min(r, c)-1;

        int bottomright = 8 - Math.max(r, c);

        int topright = Math.min(r, 9-c)-1;

        int bottomleft = 8 - Math.max(r, 9-c);

        return (topleft+bottomright+topright+bottomleft);
    }
}

class Prime {

    public void prob(int n) {

        int[] Prime = new int[n];
        Prime[0] = 0;
        if (n <= 1) return;

        for (int i = 2; i <= n; i++)
        {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.print(i + " ");
            }
        }
    }
}

class PrimeSum {

    public int sum(int n) {

        if (n <= 1) return -1;

        int Prime = 0;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i != 0)
            {
                Prime = Prime + i;
            }
        }

        return Prime;
    }
}

public class Algorithm {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 1;
        int[] arr = new int[n];
        int[] result = new int[n];
        System.out.print("Enter the Array Element: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i <= n; i++)
        {
            if (arr[i] == arr[i+1])
            {
                result[count++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print("The result Array is: " + result);
        }
        
        sc.close();
        
    }
}