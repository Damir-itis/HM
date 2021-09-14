import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class ParserTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void parseOperatorOrErrorPlus() {
        String operator = "+";
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseOperatorOrErrorMinus() {
        String operator = "-";
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseOperatorOrErrorMultiplication() {
        String operator = "*";
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseOperatorOrErrorDivision() {
        String operator = "/";
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseOperatorOrError() {
        String operator = "%";
        exit.expectSystemExitWithStatus(3);
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseIntOrError(){
        String string = "D";
        exit.expectSystemExitWithStatus(2);
        Parser.parseIntOrError(string);
    }
}

