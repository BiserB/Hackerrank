package bigNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {

        Character p1 = '{';
        Character p1close = '}';
        Character p2 = '(';
        Character p2close = ')';
        Character p3 = '[';
        Character p3close = ']';

        Scanner scanner = new Scanner(System.in);

        Stack<Character> parentheses = new Stack<>();

        while(scanner.hasNext()){

            String line = scanner.next();
            parentheses.clear();

            for (Character ch: line.toCharArray()) {

                if (ch.equals(p1) || ch.equals(p2) || ch.equals(p3)){
                    parentheses.push(ch);
                }
                else if(ch.equals(p1close)){

                    if (parentheses.empty()){
                        parentheses.push(ch);
                        break;
                    }

                    if (parentheses.peek().equals(p1)){
                        parentheses.pop();
                    }
                }
                else if(ch.equals(p2close)){

                    if (parentheses.empty()){
                        parentheses.push(ch);
                        break;
                    }

                    if (parentheses.peek().equals(p2)){
                        parentheses.pop();
                    }
                }
                else if(ch.equals(p3close)){

                    if (parentheses.empty()){
                        parentheses.push(ch);
                        break;
                    }

                    if (parentheses.peek().equals(p3)){
                        parentheses.pop();
                    }
                }
            }

            boolean isBalanced = parentheses.size() == 0 ? true: false;

            System.out.println(isBalanced);
        }
    }
}
