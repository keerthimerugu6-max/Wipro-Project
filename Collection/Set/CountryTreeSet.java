import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String CountryName) {
        T1.add(CountryName);
        return T1;
    }

    public String getCountry(String CountryName) {

        for (String country : T1) {

            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries : " + obj.T1);

        String result = obj.getCountry("Japan");

        if (result != null)
            System.out.println("Country Found : " + result);
        else
            System.out.println("Country Not Found");
    }
}