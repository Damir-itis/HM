public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Args format is: val1 +-/* val2");
            System.exit(1);
            return;
        }

        var val1 = Parser.parseIntOrError(args[0]);
        var val2 = Parser.parseIntOrError(args[2]);
        var operator = (Parser.parseOperatorOrError(args[1]));

        System.out.println("Result is " + Calculator.calculate(val1, operator, val2));
    }
}