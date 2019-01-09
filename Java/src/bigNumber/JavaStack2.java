package bigNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack2 {

    public static void main(String[] args) {

        Map<Character, Character> pairs = new HashMap<>();

        pairs.put('{', '}');
        pairs.put('[', ']');
        pairs.put('(', ')');

        Scanner scanner = new Scanner(System.in);
        Stack<Character> parentheses = new Stack<>();

        while(scanner.hasNext()){

            String line = scanner.next();
            parentheses.clear();

            for (Character ch: line.toCharArray()) {

                if (pairs.keySet().contains(ch)){
                    parentheses.push(pairs.get(ch));
                }
                else if(pairs.values().contains(ch)){

                    if (parentheses.empty()){
                        parentheses.push(ch);
                        break;
                    }

                    if (parentheses.peek().equals(ch)){
                        parentheses.pop();
                    }
                    else{
                        break;
                    }
                }
            }

            boolean isBalanced = parentheses.empty();

            System.out.println(isBalanced);
        }
    }
}
