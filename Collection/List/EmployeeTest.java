public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101,"Rahul","rahul@gmail.com","Male",45000);
        Employee e2 = new Employee(102,"Priya","priya@gmail.com","Female",50000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        db.showAllEmployees();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");

        db.showAllEmployees();
    }
}