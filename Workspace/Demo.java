
import java.util.*;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
import java.util.stream.Stream;
 

class Counter {
    
    int count;

    public synchronized void increment() {

        count++;
    }
}

/* 
// class A implements Runnable {

//     public void run() {

//         for(int i = 1; i <= 5; i++)
//             System.out.println("Hi");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//     }
// }
// class B implements Runnable {

//     public void run() {

//         for(int i = 1; i <= 5; i++)
//             System.out.println("Hello");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//     }
// }*/

/* 
public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Counter cn = new Counter();

        Runnable obj = () ->
        {
            for(int i = 1; i <= 1000; i++)

                cn.increment();
                // System.out.println("Hi");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {  e.printStackTrace();}
                           
        };
        Runnable obs = () ->
        {
            for(int i = 1; i <= 1000; i++)

                cn.increment();
                // System.out.println("Hello");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {  e.printStackTrace();}
                           
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obs);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(cn.count);
    }

}
*/

class Student implements Comparable<Student>{

    int age;
    String name;

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    

    @Override
    public int compareTo(Student that) {

        if(this.age > that.age)
            return 1;
        else
            return 0;
    }

    
    
}

public class Demo {

    public static  void main(String a[]) {

        /* 
        Collection<Integer> studs = new TreeSet<Integer>();
        studs.add(6);
        studs.add(5);
        studs.add(4);
        studs.add(9);
        studs.add(9);
        studs.add(9);

        //System.out.println(studs);

        Iterator<Integer> values = studs.iterator(); 

        while(values.hasNext())
            System.out.println(values.next());


        // for(int n : studs)
        //    System.out.println(n);
        
        // System.out.println(studs.indexOf(5));

        // System.out.println(studs.get(3));
        */

        /* 
        Map<String, Integer> students = new HashMap<>();

        students.put("Aminur", 15);
        students.put("Tarikul", 20);
        students.put("Sohel", 16);
        students.put("Sana", 14);

        //System.out.println(students);

        System.out.println(students.keySet());

        for(String key : students.keySet())
            System.out.println(key + " : " + students.get(key));

            */

        /* 
        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {

                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        
        studs.add(new Student(22, "Aminur"));
        studs.add(new Student(22, "Imrana"));
        studs.add(new Student(21, "Darling"));
        studs.add(new Student(20, "Naaz"));

        Collections.sort(studs);
        for(Student s : studs)
            System.out.println(s);
            */


        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);


        Stream<Integer> sortedValues = nums.stream()
                            .filter(n ->n%2==0)
                            .sorted();
        //                 .map(n -> n*2)
        //                 .reduce(0, (c,e) -> c+e);

        sortedValues.forEach(n -> System.out.println(n));

        // System.out.println(result);


        // Function<Integer, Integer> fun = new Function<Integer,Integer>() {
        //     public Integer apply(Integer n) {

        //        return n*2; 
        //     }
            
        // };

        
        // int result = nums.stream()
        //                 .filter(n ->n%2==0)
        //                 .map(n -> n*2)
        //                 .reduce(0, (c,e) -> c+e);

        // System.out.println(result);


        /* 
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);


        s3.forEach(n -> System.out.println(n));

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 != 0);

        s2.forEach(n -> System.out.println(n));
        
        Consumer<Integer> cn = new Consumer<Integer>() {
            
            public void accept(Integer n) {

                System.out.println(n);
            }
        };

        Consumer<Integer> cn = n -> System.out.println(n);

        nums.forEach(cn);

        nums.forEach(n -> System.out.println(n));*/

        /* 
         for(int i = 0; i < nums.size(); i++)
            System.out.println(nums.get(i));

        for(int n : nums)
            System.out.println(n);

        int sum = 0;

        for(int n : nums)
        {
            if(n % 2 == 0)
            {
                n *= 2;
                sum += n;
            }
        }
        System.out.println(sum);
        */


    }
}