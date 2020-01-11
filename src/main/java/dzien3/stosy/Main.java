package dzien3.stosy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(balancedParens("(())"));
        System.out.println(balancedParens("())))))"));
    }


    public static boolean balancedParens(String input) {
        boolean balanced = false;
        Deque<Character> stosNawiasow = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                stosNawiasow.push(input.charAt(i));
            } else {
                try {
                    char zdjety = stosNawiasow.pop();
                    if (input.charAt(i) == '}') {
                        if (zdjety != '{') {
                            return balanced;
                        }
                    }
                    if (input.charAt(i) == ']') {
                        if (zdjety != '[') {
                            return balanced;
                        }
                    }
                    if (input.charAt(i) == ')') {
                        if (zdjety != '[') {
                            return balanced;
                        }
                    }


                } catch (NoSuchElementException e) {
                    return balanced;
                }

            }
        }

        if (stosNawiasow.isEmpty()) {
            balanced = true;
        }

        return balanced;
    }
}
