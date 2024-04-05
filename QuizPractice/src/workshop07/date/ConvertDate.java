package workshop07.date;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;

public class ConvertDate {
    private LocalDate date;
    private int num;
    public static String convert(LocalDateTime date, int a) {
        HashMap<DayOfWeek, String> map = new HashMap<>();
        map.put(DayOfWeek.MONDAY, "월요일");
        map.put(DayOfWeek.TUESDAY, "화요일");
        map.put(DayOfWeek.WEDNESDAY, "수요일");
        map.put(DayOfWeek.THURSDAY, "목요일");
        map.put(DayOfWeek.FRIDAY, "금요일");
        map.put(DayOfWeek.SATURDAY, "토요일");
        map.put(DayOfWeek.SUNDAY, "일요일");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        if (a == 1) {
            return sdf1.format(date);
        } else if (a == 2) {
            return sdf2.format(date) + map.get(date.getDayOfWeek());
        } else if (a == 3) {
            if (date.getHour() >= 12) {
                return sdf3.format(date)+"오후";
                
            }
            return sdf3.format(date)+"오전";

        }return "Type에 없습니다.";

    }

    public ConvertDate() {
    }

    public ConvertDate(LocalDate date, int num) {
        this.date = date;
        this.num = num;
     }
}


