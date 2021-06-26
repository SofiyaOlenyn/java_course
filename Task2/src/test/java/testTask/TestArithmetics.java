package testTask;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {
    private static Arithmetics a;

    //@Before перед кожним тестом
    //@After після
    //@Ignore

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(1000);

    @BeforeClass // 1 раз
    public static void runT() {
        a = new Arithmetics();

    }

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertTrue(res == 10);
        Assert.assertNotNull(a);

    }

    @Test
    public void testDeduct() {
        double res = a.deduct(7, 3);
        Assert.assertFalse(res != 4);

    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        if (res != 21) Assert.fail();
        a = null;
    }

    @Test
    public void testDiv() {
        double res = a.div(7, 7);
        if (res != 1) Assert.fail();

    }

   // @Test(expected = ArithmeticException.class)
    @Test
    public void testDivOnException() {
        exp.expect(ArithmeticException.class);
        a.div(5, 0);
    }

    @Test(timeout = 1000)
    public void testN() {

    }
}
