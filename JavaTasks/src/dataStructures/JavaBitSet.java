package dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        scanner.nextLine();

        int size = size1 > size2 ? size1 : size2;

        BitSet set1 = new BitSet(size);
        BitSet set2 = new BitSet(size);

        while(scanner.hasNext()){

            String[] tokens = scanner.nextLine().split(" ");

            String operand = tokens[0];
            int num1 = Integer.parseInt(tokens[1]);
            int num2 = Integer.parseInt(tokens[2]);

            switch(operand){
                case "AND":
                    if (num1 == 1 && num2 == 2){
                        set1.and(set2);
                    }
                    else if(num1 == 2 && num2 == 1){
                        set2.and(set1);
                    }
                    else if(num1 == 1 && num2 == 1){
                        set1.and(set1);
                    }
                    else if(num1 == 2 && num2 == 2){
                        set2.and(set2);
                    }
                    break;
                case "OR":
                    if (num1 == 1 && num2 == 2){
                        set1.or(set2);
                    }
                    else if(num1 == 2 && num2 == 1){
                        set2.or(set1);
                    }
                    else if(num1 == 1 && num2 == 1){
                        set1.or(set1);
                    }
                    else if(num1 == 2 && num2 == 2){
                        set2.or(set2);
                    }
                    break;
                case "XOR":
                    if (num1 == 1 && num2 == 2){
                        set1.xor(set2);
                    }
                    else if(num1 == 2 && num2 == 1){
                        set2.xor(set1);
                    }
                    else if(num1 == 1 && num2 == 1){
                        set1.xor(set1);
                    }
                    else if(num1 == 2 && num2 == 2){
                        set2.xor(set2);
                    }
                    break;
                case "FLIP":
                    if (num1 == 1){
                        set1.flip(num2);
                    }
                    else if(num1 == 2){
                        set2.flip(num2);
                    }
                    break;
                case "SET":
                    if (num1 == 1){
                        set1.set(num2);
                    }
                    else if(num1 == 2){
                        set2.set(num2);
                    }
                    break;
            }

            System.out.println(set1.cardinality() + " " + set2.cardinality());
        }
    }
}
