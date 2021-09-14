import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatePlus() {
        int val1 = 2;
        int val2 = -4;
        String operator = "+";
        Assert.assertEquals(val1 + val2, Calculator.calculate(val1, operator, val2));
        Assert.assertEquals(0, Calculator.calculate(val2, "e", val1));
    }

    @Test
    public void calculateMinus() {
        int val1 = 2;
        int val2 = -4;
        String operator = "-";
        Assert.assertEquals(val1 - val2, Calculator.calculate(val1, operator, val2));
    }

    @Test
    public void calculateMultiplication() {
        int val1 = 2;
        int val2 = -4;
        String operator = "*";
        Assert.assertEquals(val1 * val2, Calculator.calculate(val1, operator, val2));
    }
    @Test
    public void calculateDivision() {
        int val1 = 2;
        int val2 = -4;
        String operator = "/";
        Assert.assertEquals(val2 / val1, Calculator.calculate(val2, operator, val1));
    }

}