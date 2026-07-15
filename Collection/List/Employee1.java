public class Employee1 {

    int empId;
    String empName;
    float salary;

    public Employee1(int empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String toString() {
        return empId + " " + empName + " " + salary;
    }
}