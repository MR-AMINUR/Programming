import java.util.*;


class Computer {

    public void playNasheed() {
        System.out.println("Wedding Nasheed....");
    }
    
}

class Mobile {

    String brand;
    int price;
    static String name;

    public void show() {

        System.out.println(brand + " : " + price + " : " + name);
    }
}

class Human {

    public int age;
    public String name ;

    public Human() {
        System.out.println("In a haram friendship!");
    }

    public int getAge() {

        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class A {

    public void show() {
        System.out.println("In A");
    }
    public void config() {
        System.out.println("In configuration");
    }
}

class B extends A {

    public void show() {
        System.out.println("In B");
    }
}

class Laptop {

    String model;
    int price;

    public String toString() {

        return model + " : " + price;
    }

    public boolean equals(Laptop that) {

        return this.model.equals(that.model) && this.price ==that.price;
    }
}

/* 

class SubQuadratic {

    public int ArrayElement(Integer[] a, Integer[] b) {

        int size = a.length;
        int count = 0;

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                if (a[i] == b[j])
                    count++;
        }

        return count;
    }
}

class ArraySum {

    public int solve (Integer[] a) {

        int N = a.length;
        int B = 0;

        if (B == N)
            return sum(a);
        return B;

    }

    private int sum(Integer[] a) {
        Integer sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }
}
*/

class C implements Runnable {

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
}

public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
     
    /* 
       // Computer cpu = new Computer();
        //cpu.playNasheed();
    /* 
       int nums[] = new int[4];

        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 65;
        nums[3] = 9;

        for(int i = 0; i < 4; i++)
            System.out.print(nums[i] + " ");
        
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
               nums[i][j] = (int)(Math.random()*10);
            }
            
        }

        for(int n[] : nums) {
            for(int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
            */
    
    /*       
    String name = "Aminur";
    name = name + " Rahaman";
    System.out.println("Assalamualaikum " + name);
        

    StringBuffer sb = new StringBuffer("Aminur");
    sb.append(" Imrana");
    sb.insert(6, " adores");
    
    System.out.println(sb);
    
    
    Class.forName("Mobile");

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1500;
    Mobile.name = "Smartphone";

    Mobile obj2 = new Mobile();
   */

    /* 
    Human being = new Human();
    // being.age = 23;
    // being.name = "Aminur";

    being.setAge(23);
    being.setName("Precious");

    System.out.println(being.getName() + " : " + being.getAge());
        
   
    A a = new A();
    a.show();
    a.config();
        

    Laptop pc = new Laptop();
    pc.model = "Lenovo Ideapad";
    pc.price = 1000;

    Laptop ps = new Laptop();
    ps.model = "Lenovo Ideapad";
    ps.price = 100;

    boolean result = pc.equals(ps);

    System.out.println(result);

        */
    
    Scanner sc = new Scanner(System.in); 

    /* 
    //Permutation pt = new Permutation();
    
    System.out.print("Enter the size of Arrays: ");
    int size = sc.nextInt();

    Integer[] a = new Integer[size];
    Integer[] b = new Integer[size];

    System.out.println("Enter the 1st Array Elements: ");
    for (int i = 0; i < size; i++)
        a[i] = sc.nextInt();

    System.out.println("Enter the 2nd Array Elements: ");
    for (int i = 0; i < size; i++)
        b[i] = sc.nextInt();

    //pt.ArrayElement(a, b);
        */

        
    sc.close();

    }
}