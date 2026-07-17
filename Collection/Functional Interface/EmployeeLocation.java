import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee3> list = new ArrayList<>();

        list.add(new Employee3(101,"Rahul","Pune",25000));
        list.add(new Employee3(102,"Anu","Hyderabad",22000));
        list.add(new Employee3(103,"Kiran","Chennai",28000));
        list.add(new Employee3(104,"Sneha","Bangalore",26000));
        list.add(new Employee3(105,"Ravi","Delhi",30000));

        Function<Employee3,String> f = emp -> emp.location;

        ArrayList<String> locations = new ArrayList<>();

        list.forEach(emp -> locations.add(f.apply(emp)));

        System.out.println(locations);
    }
}