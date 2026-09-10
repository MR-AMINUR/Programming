import java.util.*;

class JavaBasics {
    /*
        //Reverse an array in-place.
        Find the second largest element without sorting.
        //Move all zeroes to the end of an array.
        Find the missing number from 1...N.
        //Solve the Two Sum problem.
        Find the maximum subarray sum.
    */

    public ArrayList<Integer> moveZeros(ArrayList<Integer> list) {
        int k = 0; 
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) != 0) {
                int temp = list.get(i);
                list.set(i, list.get(k));
                list.set(k, temp);

                k++;
            }
        }

        return list;
    }

    public ArrayList<Integer> addArrays(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        
        int i = list1.size()-1;
        int j = list2.size()-1;
        int carry = 0, sum = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry > 0) {
            
            int digitA = (i >= 0) ? list1.get(i) : 0;
            int digitB = (j >= 0) ? list2.get(j) : 0;
            sum = digitA + digitB + carry;

            list.add(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        Collections.reverse(list);
        return list;
    }

    public ArrayList<Integer> arrayReversal(ArrayList<Integer> list) {

        int st = 0; 
        int en = list.size()-1;

        while (st < en) {
            int temp = list.get(st);
            list.set(st, list.get(en));
            list.set(en, temp);

            st++;
            en--;
        }

        return list;
    }

    public int secondLargest(ArrayList<Integer> list) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int li : list) {
            if (li > highest) {
                secondHighest = highest;
                highest = li;
                
            } else if (li > secondHighest && li != highest) {
                secondHighest = li;
            }
        }

        return secondHighest;
    }
}

public class Basics {

    
    public static void main(String[] args) {
        
        JavaBasics jb = new JavaBasics();

        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(9);
        list.add(2);
        list.add(3);
        
        System.out.println(jb.secondLargest(list));
        
    }
}
