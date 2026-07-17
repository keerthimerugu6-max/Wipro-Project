import java.time.LocalTime;

public class TimeBeforeFiveHoursThirtyMinutes {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime previousTime = currentTime.minusHours(5).minusMinutes(30);

        System.out.println("Current Time : " + currentTime);
        System.out.println("Before 5 Hours 30 Minutes : " + previousTime);
    }
}