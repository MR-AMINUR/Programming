import java.util.*;

class JavaBasics {
    /*
        //Reverse an array in-place.
        //Find the second largest element without sorting.
        //Move all zeroes to the end of an array.
        //Find the missing number from 1...N.
        //Solve the Two Sum problem.
        //Find the maximum subarray sum.
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

    public int missingInteger(ArrayList<Integer> list, int n) {
        int expectedSum = n * (n+1)/2;

        int actualSum = 0;

        for (int li : list) {
            actualSum += li;
        }


        return (expectedSum-actualSum);
    }

    public int subArraySum(ArrayList<Integer> list) {

        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;

        for (int li : list) {
            currSum += li;
        }

        maxSum = Math.max(maxSum, currSum);

        if (currSum < 0) {
            currSum = 0;
        }

        return maxSum;
    }

    /*
        //Check whether a string is a palindrome.
        //Count the frequency of each character.
        //Check whether two strings are anagrams.
        //Find the first non-repeating character.
        //Check whether one string is a rotation of another.
    */

    public boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public HashMap<Character, Integer> trackFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length()-1; i++) {
            map.put(str.charAt(i), i);
        }

        return map;
    }

    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    public Character findCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public boolean isRotational(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String combined = str1+str1;

        return combined.contains(str2);
    }

    /*
        // Hashmap
        Solve Two Sum using HashMap.
        Find the first non-repeating element.
        Find the longest subarray with a given sum.
    */
    public ArrayList<Integer> twoSum(ArrayList<Integer> list, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size()-1; i++) {
            map.put(i, list.get(i));
        }

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(map.get(target));

        return sum;
    }
    /*
        // Two pointers
        Two Sum in a sorted array.
        Check palindrome using two pointers.
        Find the maximum area/container problem.
    */
}

public class Basics {

    
    public static void main(String[] args) {
        
        JavaBasics jb = new JavaBasics();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(jb.twoSum(list, 6));
        
    }
}
