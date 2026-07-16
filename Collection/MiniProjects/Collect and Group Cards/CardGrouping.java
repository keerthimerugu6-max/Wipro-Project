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

public class CardGrouping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, ArrayList<Card>> map = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            String symbol = sc.nextLine();
            int number = Integer.parseInt(sc.nextLine());

            Card card = new Card(symbol, number);

            if (map.containsKey(symbol)) {
                map.get(symbol).add(card);
            } else {
                ArrayList<Card> list = new ArrayList<>();
                list.add(card);
                map.put(symbol, list);
            }
        }

        System.out.println("Distinct Symbols are :");

        for (String symbol : map.keySet()) {
            System.out.print(symbol + " ");
        }

        System.out.println();

        for (String symbol : map.keySet()) {

            ArrayList<Card> list = map.get(symbol);

            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;

            for (Card c : list) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}