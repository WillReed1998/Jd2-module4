package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        char[] transformedChars = new char[chars.length];
        int transformedCharsCount = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                if (i % 2 == 0) {
                    transformedChars[transformedCharsCount] = Character.toLowerCase(c);
                } else {
                    transformedChars[transformedCharsCount] = Character.toUpperCase(c);
                }
                transformedCharsCount++;
            }
        }

        char[] finalTransformedChars = new char[transformedCharsCount];
        System.arraycopy(transformedChars, 0, finalTransformedChars, 0, transformedCharsCount);
        String transformedString = new String(finalTransformedChars);
        System.out.println(transformedString);
    }
}