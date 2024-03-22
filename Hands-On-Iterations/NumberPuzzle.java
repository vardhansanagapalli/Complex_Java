/*Kevin is trying to solve a number puzzle. If the number is greater than fifty, he wants the difference between the digits of the number; otherwise, if the number is less than or equal to fifty, he wants to reverse the number and find the difference in digits. Help Kevin to solve the problem using a Java program.

Requirements:
    The input number should be a two-digit integer, or else display "Invalid number".
Note:

    In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
    Ensure to follow the object-oriented specifications provided in the question description.
    Ensure to provide the names for classes, attributes, and methods as specified in the question description.
    Adhere to the code template, if provided.    Please do not use System.exit(0) to terminate the program.
Sample Input/Output 1:
Enter the number
56
-1
Explanation:
56 is greater than 50, so subtract 5 - 6 = -1
Sample Input/Output 2:
Enter the number
48
4
*/

import java.util.Scanner;

class NumberPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        NumberSolver solver = new NumberSolver();
        solver.solveNumberPuzzle(number);
    }
}

class NumberSolver {
    public void solveNumberPuzzle(int number) {
        if (number < 10 || number > 99) {
            System.out.println("Invalid number");
        } else {
            if (number > 50) {
                int diff = (number / 10) - (number % 10);
                System.out.println(diff);
            } else {
                int reversed = (number % 10) * 10 + number / 10;
                int diff = (reversed / 10) - (reversed % 10);
                System.out.println(diff);
            }
        }
    }
}