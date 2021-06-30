package gameTest;

import game.Controller;
import game.Model;
import game.View;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static game.View.INPUT_VALUE_IN_RANGE;
import static junit.framework.TestCase.assertEquals;

public class GameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private static Controller controller;
    private static Model model;
    private static View view;

    @BeforeClass
    public static void before() {
        model = new Model();
        view = new View();
        controller = new Controller(model, view);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testValidateInput() {
        Scanner sc = new Scanner("2");
        int input = controller.validateInputValue(sc);
        Assert.assertTrue(input == 2);
    }

    @Test(expected = NoSuchElementException.class)
    public void testDivOnException() {
        Scanner sc = new Scanner("2.3");
        int input = controller.validateInputValue(sc);
    }

    @Test
    public void testRandomValueInRange() {
        int i = 0;
        int value;
        while (i <= 500) {
            value = model.getRandomValue(0, 100);
            Assert.assertTrue(value < 100 && value > 0);
            i++;
        }
    }

    @Test
    public void testPrintInputInRangeMessageOutput() {
        view.printInputInRangeMessage(20,30);
        String s = INPUT_VALUE_IN_RANGE + " [ " + 20 + ";" + 30 + " ]"+"\r\n";
        assertEquals(s, outContent.toString());
    }



}
