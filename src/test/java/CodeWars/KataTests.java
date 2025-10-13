package CodeWars;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class KataTests {
    @Test
    public void points(){
        assertTrue(KataFour.betterThanAverage(new int[]{2, 3}, 5));
        assertFalse(KataFour.betterThanAverage(new int []{2, 3},2));
    }
}
