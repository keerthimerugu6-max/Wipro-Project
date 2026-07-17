import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ravi", 70));
        students.add(new Student(2, "Anu", 45));
        students.add(new Student(3, "Kiran", 80));
        students.add(new Student(4, "Sneha", 50));
        students.add(new Student(5, "Raju", 30));

        long count = students.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students who passed:");

        students.stream()
                .filter(s -> s.mark >= 50)
                .forEach(System.out::println);

        System.out.println("Count = " + count);
    }
}