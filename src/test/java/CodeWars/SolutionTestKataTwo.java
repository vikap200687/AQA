package CodeWars;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;

public class SolutionTestKataTwo {
    @Test
    public void testSomething() {
        assertEquals("", KataTwo.countingSheep(0));
        assertEquals("1 sheep...", KataTwo.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", KataTwo.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", KataTwo.countingSheep(3));
    }
}
