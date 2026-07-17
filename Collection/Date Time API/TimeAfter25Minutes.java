import java.time.LocalTime;

public class TimeAfter25Minutes {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime newTime = currentTime.plusMinutes(25);

        System.out.println("Current Time : " + currentTime);
        System.out.println("After 25 Minutes : " + newTime);
    }
}