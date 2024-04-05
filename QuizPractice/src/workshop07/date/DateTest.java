package workshop07.date;

import java.time.LocalDate;

import static workshop07.date.ConvertDate.convert;

public class DateTest {
    public static void main(String[] args) {

        ConvertDate convertDate = new ConvertDate();
        System.out.println(convert(LocalDate.now(),1));
        System.out.println(convert(LocalDate.now(),2));

    }
}
