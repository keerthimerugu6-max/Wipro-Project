import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee1> employees = new Vector<>();

        employees.add(new Employee1(101,"Rahul",40000));
        employees.add(new Employee1(102,"Priya",50000));
        employees.add(new Employee1(103,"Amit",60000));

        System.out.println("Using Iterator");

        Iterator<Employee1> itr = employees.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nUsing Enumeration");

        Enumeration<Employee1> en = employees.elements();

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}