import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Application {
    @Test
    public void java() {
        // Здесь размещаем код теста
        int actualSum = 2 + 2;
        int expectedSum = 4;
        // Используем assertTrue, assertFalse,  assertEquals и другие методы Assertions
        assertEquals(expectedSum, actualSum);
    }
}

