package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase to ensure accurate comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();// convert String to CharArray()
        char[] chars2 = str2.toCharArray();// convert String to CharArray()

        Arrays.sort(chars1); // sort in alphabet accending order;
        Arrays.sort(chars2);
        System.out.println(chars1);
        System.out.println(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        scanner.close();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams."); //PURNA, purna
        } else {
            System.out.println("The two strings are not anagrams.");//ajeeth, shiva
        }
    }
}
