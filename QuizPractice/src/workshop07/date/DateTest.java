package workshop07.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static workshop07.date.ConvertDate.convert;

public class DateTest {
    public static void main(String[] args) {

        ConvertDate convertDate = new ConvertDate();
        System.out.println(convert(LocalDateTime.now(),1));
        System.out.println(convert(LocalDateTime.now(),2));

    }
}
