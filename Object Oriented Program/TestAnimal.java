class TestAnimal {

    public static void main(String[] args) {

        Animal a = new Animal();

        System.out.println("Animal Details");
        a.eat();
        a.sleep();

        System.out.println();

        Bird b = new Bird();

        System.out.println("Bird Details");
        b.eat();
        b.sleep();
        b.fly();
    }
}