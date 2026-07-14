public class TestInstrument {

    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[10];

        for (int i = 0; i < instruments.length; i++) {

            if (i % 3 == 0)
                instruments[i] = new Piano();
            else if (i % 3 == 1)
                instruments[i] = new Flute();
            else
                instruments[i] = new Guitar();
        }

        for (int i = 0; i < instruments.length; i++) {

            System.out.print("Index " + i + ": ");

            instruments[i].play();

            if (instruments[i] instanceof Piano)
                System.out.println("Object is Piano");

            else if (instruments[i] instanceof Flute)
                System.out.println("Object is Flute");

            else if (instruments[i] instanceof Guitar)
                System.out.println("Object is Guitar");

            System.out.println();
        }
    }
}