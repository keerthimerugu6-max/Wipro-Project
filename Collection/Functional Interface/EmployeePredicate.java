import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate {

    public static void main(String[] args) {

        ArrayList<Employee5> list = new ArrayList<>();

        list.add(new Employee5(101,"Rahul",9000));
        list.add(new Employee5(102,"Anu",12000));
        list.add(new Employee5(103,"Kiran",8000));
        list.add(new Employee5(104,"Sneha",15000));
        list.add(new Employee5(105,"Ravi",7000));

        Predicate<Employee5> p = emp -> emp.getSalary() < 10000;

        list.stream()
                .filter(p)
                .forEach(emp -> System.out.println(emp.getName()));
    }
}