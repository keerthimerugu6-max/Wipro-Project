class Box {

    double width;
    double height;
    double depth;

    // Parameterized Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        // Create object
        Box b = new Box(5, 4, 3);

        // Display dimensions
        System.out.println("Width : " + b.width);
        System.out.println("Height: " + b.height);
        System.out.println("Depth : " + b.depth);

        // Display volume
        System.out.println("Volume of Box = " + b.volume());
    }
}