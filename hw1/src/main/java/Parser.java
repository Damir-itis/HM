public class Parser {
    static String parseOperatorOrError(String operator) {
        if ("+".equals(operator) ||
                "-".equals(operator) ||
                "*".equals(operator) ||
                "/".equals(operator)
        ) {

            return operator;
        }
        System.out.println("Operator is not supported");
        System.exit(3);
        return "";
    }

    static int parseIntOrError(String val) {
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e) {
            System.out.println("Val1 is not int");
            System.exit(2);
            return 0;
        }
    }
}