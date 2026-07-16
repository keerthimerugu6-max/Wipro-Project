import java.util.*;

class Box implements Comparable<Box> {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Box))
            return false;

        Box b = (Box) obj;

        return Double.compare(this.getVolume(), b.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(getVolume()).hashCode();
    }

    @Override
    public int compareTo(Box b) {
        return Double.compare(this.getVolume(), b.getVolume());
    }
}

public class BoxSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Box> set = new TreeSet<>();

        System.out.println("Enter the number of Box");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Width");
            double width = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Height");
            double height = Double.parseDouble(sc.nextLine());

            set.add(new Box(length, width, height));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {

            System.out.printf(
                    "Length =%.1f Width =%.1f Height =%.1f Volume =%.2f%n",
                    b.getLength(),
                    b.getWidth(),
                    b.getHeight(),
                    b.getVolume());
        }

        sc.close();
    }
}