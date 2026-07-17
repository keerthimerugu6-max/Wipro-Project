import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 24, "Pune"));
        employees.add(new Employee(102, "Amit", 26, "Hyderabad"));
        employees.add(new Employee(103, "Priya", 22, "Pune"));
        employees.add(new Employee(104, "Kiran", 28, "Chennai"));
        employees.add(new Employee(105, "Sneha", 25, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}