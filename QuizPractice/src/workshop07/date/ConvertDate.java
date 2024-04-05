package workshop07.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class ConvertDate {
    private LocalDate date;
    private int num;
    public static String convert(LocalDate date, int a) {
        HashMap<DayOfWeek, String> map = new HashMap<>();
        map.put(DayOfWeek.MONDAY, "월요일");
        if (a == 1) {
            return date.getYear() + "-" + date.getMonthValue() + "-" + date.getDayOfMonth();
        } else if (a == 2) {
            return date.getYear() + "년 " + date.getMonthValue() + "월" + date.getDayOfMonth() + "일 " + date.getDayOfWeek();
        } else if (a == 3) {
            return "dd";

        }return "Type에 없습니다.";

    }

    public ConvertDate() {
    }

    public ConvertDate(LocalDate date, int num) {
        this.date = date;
        this.num = num;
    }
}
