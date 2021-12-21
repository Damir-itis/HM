import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.util.InvalidPropertiesFormatException;

public class ParserTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void parseOperatorOrErrorPlus() throws InvalidPropertiesFormatException {
        String operator = "+";
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseOperatorOrErrorMinus() throws InvalidPropertiesFormatException {
        String operator = "-";
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseOperatorOrErrorMultiplication() throws InvalidPropertiesFormatException {
        String operator = "*";
        Parser.parseOperatorOrError(operator);
    }

    @Test
    public void parseOperatorOrErrorDivision() throws InvalidPropertiesFormatException {
        String operator = "/";
        Parser.parseOperatorOrError(operator);
    }

//    @Test
//    public void parseOperatorOrError() throws InvalidPropertiesFormatException {
//        String operator = "%";
//        exit.expectSystemExitWithStatus(3);
//        Parser.parseOperatorOrError(operator);
  //  }

//    @Test
//    public void parseIntOrError(){
//        String string = "D";
//        exit.expectSystemExitWithStatus(2);
//        Parser.parseIntOrError(string);
//    }
}

