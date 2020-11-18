package by.academy.lesson8.date;
import java.time.LocalTime;

public class LocalTimeDemo2 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nanosecond = now.getNano();

        System.out.println("Часы: " + hour);
        System.out.println("Минуты: " + minute);
        System.out.println("Секунды: " + second);
        System.out.println("Наносекунды: " + nanosecond);
    }
}