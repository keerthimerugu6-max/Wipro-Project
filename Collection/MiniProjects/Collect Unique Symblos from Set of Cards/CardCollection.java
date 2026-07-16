import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}

public class CardCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Card> map = new LinkedHashMap<>();

        int count = 0;

        while (map.size() < 4) {

            System.out.println("Enter a card :");

            String symbol = sc.nextLine().toLowerCase();

            int number = Integer.parseInt(sc.nextLine());

            count++;

            if (!map.containsKey(symbol)) {
                map.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        TreeMap<String, Card> sorted = new TreeMap<>(map);

        for (Map.Entry<String, Card> entry : sorted.entrySet()) {

            Card c = entry.getValue();

            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}