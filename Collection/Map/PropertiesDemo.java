import java.util.*;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");
        p.put("Tamil Nadu", "Chennai");

        Iterator<Object> itr = p.keySet().iterator();

        while (itr.hasNext()) {

            String state = (String) itr.next();

            System.out.println(state + " : " + p.getProperty(state));
        }

    }
}