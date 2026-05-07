import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    MathUtils math = new MathUtils() ;

    @Test 
    public void testAdd() {
        assertEquals(5, math.add(2, 3)) ;
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> math.divide(10, 0)) ;
    }
}