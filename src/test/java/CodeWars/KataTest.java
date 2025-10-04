package CodeWars;  // Убедитесь, что пакет совпадает с вашим Kata.java

import static org.junit.Assert.*;  // Импорт для assertEquals (если JUnit подключён)
import org.junit.Test;  // Импорт для @Test

public class KataTest {
    @Test
    public void testQuarterOf() {
        // Тесты для кварталов
        assertEquals(1, Kata.quarterOf(1));  // Месяц 1 -> квартал 1
        assertEquals(1, Kata.quarterOf(2));
        assertEquals(1, Kata.quarterOf(3));

        assertEquals(2, Kata.quarterOf(4));  // Месяц 4 -> квартал 2
        assertEquals(2, Kata.quarterOf(5));
        assertEquals(2, Kata.quarterOf(6));

        assertEquals(3, Kata.quarterOf(7));  // Месяц 7 -> квартал 3
        assertEquals(3, Kata.quarterOf(8));
        assertEquals(3, Kata.quarterOf(9));

        assertEquals(4, Kata.quarterOf(10)); // Месяц 10 -> квартал 4
        assertEquals(4, Kata.quarterOf(11));
        assertEquals(4, Kata.quarterOf(12));
    }
}
