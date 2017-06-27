import java.util.UUID;

public class Exce0 {

    static void test0() {
        System.out.println("     中     ");
        System.out.println("     中     ");
        System.out.println("中中中中中中中");
        System.out.println("中    中   中");
        System.out.println("中中中中中中中");
        System.out.println("     中     ");
        System.out.println("     中     ");
        System.out.println("     中     ");
    }

    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = 60 * SECONDS_PER_MINUTE;
    static String convert(int value) {
//        assert value >= 0 && value <= 86399: "invalid value for date";
        int hour = value / SECONDS_PER_HOUR;
        int minute = value % SECONDS_PER_HOUR / SECONDS_PER_MINUTE;
        int second = value % SECONDS_PER_MINUTE;
//        return hour + ":" + minute + ":" + second;
        return new StringBuilder()
                .append(hour).append(":").append(minute).append(":").append(second)
                .toString();
//        return String.format("%2d:%2d:%2d", hour, minute, second);
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            convert(171112);
//        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

}
