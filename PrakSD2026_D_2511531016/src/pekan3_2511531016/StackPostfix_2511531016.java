package pekan3_2511531016;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511531016 {
	public static int postfixEvaluate(String expression) {
        Stack<Integer> s_1016 = new Stack<Integer>();
        Scanner input_1016 = new Scanner (expression);
        while (input_1016.hasNext()) {
                if (input_1016.hasNextInt()) {                // an operand (integer)
                        s_1016.push (input_1016.nextInt());
                } else {                                                        // an operator
                        String operator = input_1016.next();
                        int operand2 = s_1016.pop();
                        int operand1 = s_1016.pop();
                        if (operator.equals("+")) {
                                s_1016.push(operand1 + operand2);
                        } else if (operator.equals("-")) {
                                s_1016.push(operand1 - operand2);
                        } else if (operator.equals("*")) {
                                s_1016.push(operand1 * operand2);
                        } else {
                                s_1016.push(operand1 / operand2);
                        }        
                }
        }
        input_1016.close();
        return s_1016.pop();
}
public static void main(String[] args) {
        System.out.println("hasil postfix= " + postfixEvaluate("5 2 4 * + 7 -"));
}
}