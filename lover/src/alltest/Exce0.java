package alltest;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
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

    static String convert(int dollars, int cents) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(dollars + cents/100.0);

//        DecimalFormat decimalFormat = new DecimalFormat("$#,###,###,##0.00");
//        return decimalFormat.format(dollars + cents/100.0);

//        StringBuilder stringBuilder = new StringBuilder();
//        String sDollars = DecimalFormat.getNumberInstance().format(dollars);
//        String sCents   = cents < 10? "0" + cents: String.valueOf(cents);
//        stringBuilder.append("$").append(sDollars).append(".").append(sCents);
//        return stringBuilder.toString();
    }


    static void fx(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (j == 1) System.out.printf("%02d ", i * i);
                else if (i == 1 || i <= j) System.out.printf("%02d ", (j - 1)*(j - 1) + i);
                else System.out.printf("%02d ", i * i - j + 1);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
//        long begin = System.currentTimeMillis();
////        for (int i = 0; i < 1_000_000; i++) {
////            convert(171112);
////        }
//        System.out.println(convert(0, 9));
//        System.out.println(convert(1523456789, 98));
//        System.out.println(convert(12, 0));
//        long end = System.currentTimeMillis();
//        System.out.println(end - begin);
        fx(4);
    }

}
