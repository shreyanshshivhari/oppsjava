package p1;

import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        System.out.println("Number of characters: " + length);


        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        // 3. Check palindrome (case-insensitive)
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}
