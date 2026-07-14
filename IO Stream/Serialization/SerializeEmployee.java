import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "Keerthi",
                    new Date(),
                    "CSE-AIML",
                    "Software Engineer",
                    650000);

            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}