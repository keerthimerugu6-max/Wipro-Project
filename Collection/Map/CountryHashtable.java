import java.util.*;

public class CountryHashtable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capital))
                return entry.getKey();

        }

        return null;
    }

    public Hashtable<String, String> swapKyeValue() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());

        }

        return M2;
    }

    public ArrayList<String> toArrayList() {

        return new ArrayList<>(M1.keySet());

    }

    public static void main(String[] args) {

        CountryHashtable obj = new CountryHashtable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println(obj.M1);

        System.out.println(obj.getCapital("India"));

        System.out.println(obj.getCountry("Tokyo"));

        System.out.println(obj.swapKyeValue());

        System.out.println(obj.toArrayList());

    }

}