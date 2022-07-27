package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShortenWord {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word = scanner.next();
        System.out.print(solve(n, word));
        scanner.close();
    }

    public static String solve(int n, String word) {
        if (word == null) {
            return null;
        }
        if (hasRepetitiveLetters(n, word)) {
            String word1 = deleteRepetitiveLetters(n, word);
            String word2 = deleteRepetitiveLetters(n, inverseString(word));
            word = (word1.length() <= word2.length()) ? solve(n, word1) : solve(n, inverseString(word2));
        }
        return word;
    }

    public static boolean hasRepetitiveLetters(int k, String input) {
        ArrayList<Character> inputChars = convertStringToCharArrayList(input);
        int counter = 1;
        for (int i = 0; i < inputChars.size() - 1; i++) {
            if (isSimilarCharacters(inputChars.subList(i, i + 2).stream().map(String::valueOf).collect(Collectors.joining()))) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter == k) {
                return true;
            }
        }
        return false;
    }

    public static String deleteRepetitiveLetters(int k, String input) {
        ArrayList<Character> inputChars = convertStringToCharArrayList(input);
        for (int i = 0; i < inputChars.size() - k; i++) {
            if (isSimilarCharacters(inputChars.subList(i, i + k).stream().map(String::valueOf).collect(Collectors.joining()))) {
                inputChars.subList(i, k + i).clear();
                i--;
            }
        }
        if (inputChars.size() == k) {
            if (isSimilarCharacters(inputChars.stream().map(String::valueOf).collect(Collectors.joining()))) {
                inputChars.clear();
            }
        }
        return inputChars.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static boolean isSimilarCharacters(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Character> convertStringToCharArrayList(String input) {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            characters.add(input.charAt(i));
        }
        return characters;
    }

    public static String inverseString(String str) {
        String inverseString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            inverseString = ch + inverseString;
        }
        return inverseString;
    }
}
