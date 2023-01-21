import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.SqrtService;

public class SqrtServiceTest {
    @Test
    public void testExpectedActualSqrt() {
        SqrtService service= new SqrtService();
        int expected = 0;
        int actual = service.calcSqrt(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2ExpectedActualSqrt() {
        SqrtService service= new SqrtService();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2NotEqualsSqrt() {
        SqrtService service= new SqrtService();
        int expected = 0;
        int unexpected = 2;
        int actual = service.calcSqrt(10, 99);

        Assertions.assertNotEquals(unexpected, expected);
    }
}

