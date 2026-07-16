import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Keerthi", 987654321);
        contacts.put("Rahul", 912345678);
        contacts.put("Anil", 998877665);

        System.out.println("Key Exists : " + contacts.containsKey("Keerthi"));

        System.out.println("Value Exists : " + contacts.containsValue(912345678));

        Iterator<Map.Entry<String, Integer>> itr = contacts.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Integer> e = itr.next();

            System.out.println(e.getKey() + " : " + e.getValue());

        }

    }

}