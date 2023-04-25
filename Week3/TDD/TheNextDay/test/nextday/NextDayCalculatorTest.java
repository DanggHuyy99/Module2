package nextday;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    NextDayCalculator nextDayCalculator = new NextDayCalculator();
    @Test
    @org.junit.jupiter.api.Test
    void findTodayAndTomorow() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = nextDayCalculator.findNextDay(today);

        assertEquals(today.plusDays(1),tomorrow);
    }

    @Test
    @org.junit.jupiter.api.Test
    void find03091999(){
        LocalDate date = LocalDate.of(1999, 9, 3);
        LocalDate nextday = nextDayCalculator.findNextDay(date);
        LocalDate expected = LocalDate.of(1999, 9, 4);
        assertEquals(expected, nextday);
    }
}