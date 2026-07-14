import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

public class OptionalExample3 {
    public static void main(String[] args) {
        Employee emp = null;  // may be null

        try {
            Employee validEmp = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee is invalid!"));
            System.out.println("Employee name: " + validEmp.name);
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
