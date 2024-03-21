/*Oliver and his friend are playing a number game. If Oliver says a 4-digit number, his friend should reverse the number and expand the number.

If the number is not a 4-digit number, then print '<<number>> is an invalid number'.

Note:

    In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
    Ensure to follow the object-oriented specifications provided in the question description.
    Ensure to provide the names for classes, attributes, and methods as specified in the question description.
    Adhere to the code template, if provided.

Please don't use System.exit(0) to terminate the program.
Sample Input/Output 
Enter the number
5864
Reversed number is 4685
4000+600+80+5
*/

import java.util.Scanner;

public class ReverseandExpand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if (isValidNumber(number)) {
            int reversedNumber = reverseNumber(number);
            String expandedForm = expandNumber(reversedNumber);
            System.out.println("Reversed number is " + reversedNumber);
            System.out.println(expandedForm);
        } else {
            System.out.println(number + " is an invalid number");
        }
        sc.close();
    }

    private static boolean isValidNumber(int number) {
        return String.valueOf(number).length() == 4;
    }

    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }

    private static String expandNumber(int number) {
        StringBuilder result = new StringBuilder();
        String numStr = String.valueOf(number);
        int length = numStr.length();
        for (int i = 0; i < length; i++) {
            int value = numStr.charAt(i) - '0';
            if (value > 0) {
                result.append(value);
                for (int j = i; j < length - 1; j++) {
                    result.append('0');
                }
                result.append(" + ");
            }
        }
        return result.substring(0, result.length() - 3);
    }
}

// Code author: Vardhan Sanagapalli