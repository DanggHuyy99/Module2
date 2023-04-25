package nextday;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class NextDayCalculator {
    public LocalDate findNextDay(LocalDate date) {
        return date.plus(1, ChronoUnit.DAYS);
    }

}
