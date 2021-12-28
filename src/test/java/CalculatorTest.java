import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    int expectedCount;
    int expectedPangkat;
    int expectedSubtr;
    Calculator calculator;

    @Before
    public void init(){
        expectedCount = 10;
        expectedPangkat = 25;
        expectedSubtr = 3;
        calculator = new Calculator();
        calculator = new Calculator(5);
    }

    @After
    public void close(){
        System.out.println("Tests are ended");
    }

    @Test
    public void countTest(){
        Assert.assertEquals("Result 10", expectedCount, calculator.count(5, 5));
    }

    @Test
    public void subtrTest(){
        Assert.assertEquals("Result 3", expectedCount, calculator.subtr(5, 2));
    }

    @Test
    public void pangkatTest(){
        Assert.assertEquals("Test pangkat", expectedPangkat, calculator.pangkat());
    }
}