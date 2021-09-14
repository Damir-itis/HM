import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculate() {
        int val1 = 2;
        int val2 = -4;
        String operator = "+";
        String operator1 = "-";
        String operator2 = "*";
        String operator3 = "/";
        Assert.assertEquals(val1 + val2, Calculator.calculate(val1, operator, val2));
        Assert.assertEquals(val1 - val2, Calculator.calculate(val1, operator1, val2));
        Assert.assertEquals(val1 * val2, Calculator.calculate(val1, operator2, val2));
        Assert.assertEquals(val2 / val1, Calculator.calculate(val2, operator3, val1));
        Assert.assertEquals(0, Calculator.calculate(val2, "e", val1));
    }
}