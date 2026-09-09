import java.util.*;

class JavaBasics {
    public static class Student implements Comparable<Student> {

        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override 
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
}

public class Basics {

    
    public static void main(String[] args) {
        
        PriorityQueue<JavaBasics.Student> pq = new PriorityQueue<>();
        pq.add(new JavaBasics.Student("A", 4));
        pq.add(new JavaBasics.Student("B", 5));
        pq.add(new JavaBasics.Student("C", 1));
        pq.add(new JavaBasics.Student("D", 3));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
