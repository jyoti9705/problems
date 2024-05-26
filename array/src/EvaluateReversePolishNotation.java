import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        for (String token : tokens
        ) {
            if (token == "+" || token == "-" || token == "*" || token == "/") {
                Long number1 = stack.pop();
                Long number2 = stack.pop();
                Long result = operate(number1, number2, token);
                stack.push(result);
            } else {
                stack.push(Long.parseLong(token));
            }


        }
        return stack.pop().intValue();
    }

    private static Long operate(Long number1, Long number2, String token) {
        if (token == "+") {
            return number1 + number2;
        } else if (token == "-") {
            return number1 - number2;
        } else if (token == "*") {
            return number1 * number2;
        } else if (token == "/") {
            return number1 / number2;
        }
        return number1;
    }
}
