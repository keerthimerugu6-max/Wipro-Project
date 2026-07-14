package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // a)
        Veena v = new Veena();
        v.play();

        // b)
        Saxophone s = new Saxophone();
        s.play();

        System.out.println();

        // c)
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}