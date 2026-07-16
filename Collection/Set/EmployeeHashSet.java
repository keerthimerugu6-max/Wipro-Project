import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Rahul");
        employees.add("Keerthi");
        employees.add("Anil");
        employees.add("Sneha");

        Iterator<String> itr = employees.iterator();

        System.out.println("Employee Names:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}