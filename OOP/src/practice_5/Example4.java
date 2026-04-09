package practice_5;

import java.util.*;

//What functionality does a StringTokenizer object provide? Give example.
//it splits string into tokens by some symbols declared into constructor
//for example string "a,b,c" will be a b c when we trace stringtokenizer

//What are the three formal parameters of the explicit value  
// constructor in the StringTokenizer class? Give example.
//first is string, second is string of delimiters, third is whether dims are tokens

//What output is generated?
//Result: 14.5

//What output is generated?
//Invalid syntax
//NoSuchElementException
//there were no tokens in tokenizer

//What output is generated?
//One or more operands is not a number
//NumberFormatException
//because a can not be cast to double

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expressions separated by space (e.g., 45.0+4.1 3.2*9.1):");
        String line = in.nextLine();

        String[] expressions = line.split("\\s+");

        for (String expr : expressions)
        {
            StringTokenizer tokenizer = new StringTokenizer(expr, "+-*/", true);

            try
            {
                String leftString = tokenizer.nextToken();
                String operator = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand = 0.0, rightOperand = 0.0;
                boolean validLeft = true, validRight = true;

                try
                {
                    leftOperand = Double.parseDouble(leftString);
                }
                catch (NumberFormatException nfe)
                {
                    validLeft = false;
                }

                try
                {
                    rightOperand = Double.parseDouble(rightString);
                }
                catch (NumberFormatException nfe) {
                    validRight = false;
                }

                if (!validLeft)
                {
                    System.out.println("Left operand is not a number: " + leftString);
                }

                if (!validRight)
                {
                    System.out.println("Right operand is not a number: " + rightString);
                }

                if (!validRight || !validLeft)
                {
                    continue;
                }

                double result = 0.0;
                switch (operator)
                {
                    case "+": result = leftOperand + rightOperand; break;
                    case "-": result = leftOperand - rightOperand; break;
                    case "*": result = leftOperand * rightOperand; break;
                    case "/": 
                        if (rightOperand == 0)
                        {
                            System.out.println("Division by zero in expression: " + expr);
                            continue;
                        }
                        result = leftOperand / rightOperand; 
                        break;
                    default: 
                        System.out.println("Unknown operator: " + operator);
                        continue;
                }

                System.out.println(expr + " = " + result);
            }
            catch (NoSuchElementException nsee)
            {
                System.out.println("Invalid syntax in expression: " + expr);
            }
        }
    }
}