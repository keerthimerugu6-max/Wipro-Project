import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("M", "Mango");

        System.out.println("Key Exists : " + map.containsKey("A"));

        System.out.println("Value Exists : " + map.containsValue("Banana"));

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> e = itr.next();
            System.out.println(e.getKey() + " = " + e.getValue());
        }

    }
}