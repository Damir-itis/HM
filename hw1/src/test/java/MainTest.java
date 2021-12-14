import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class MainTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    Scanner in = new Scanner(System.in);

    @Test
    public void mainTest() throws InvalidPropertiesFormatException {
        String[] args = new String[2];
        Parser.countOfArgumentsChecker(args);
        Main.main(args);
    }
    @Test
    public void main() throws InvalidPropertiesFormatException {
        String[] args = new String[3];
        args[0] = "2";
        args[2] = "4";
        args[1] = "+";
        Parser.countOfArgumentsChecker(args);
        Main.main(args);
    }
}