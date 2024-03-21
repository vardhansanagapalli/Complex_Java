
/*Henry has a magic goose. The goose will lay eggs only for 30 consecutive days in a year. The number of eggs laid by the goose will be in the following pattern. On day 1, it will lay 1 egg, on day 2, it will lay 2 eggs, on day 3 it will lay 5 eggs, on day 4 12 eggs and so on. Write a java program to calculate the number of eggs the goose will lay on a particular day. 

Note: The egg laying pattern follows the pell series. i.e.,[1,2,5,12,29,70...]
If the day is more than 30 or negative or zero, then print "<<day>> is an invalid day". 
Note:
    In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
    Ensure to follow the object-oriented specifications provided in the question description.
    Ensure to provide the names for classes, attributes, and methods as specified in the question description.
    Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 
Sample Input/Output 1:
Enter the day
15
Number of eggs laid in the 15th day is 195025*/

import java.util.Scanner;

public class MagicGoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        if (day <= 0 || day > 30) {
            System.out.println(day + " is an invalid day");
        } else {
            int eggs = calculateEggs(day);
            System.out.println("Number of eggs laid in the " + day + "th day is " + eggs);
        }

        sc.close();
    }

    private static int calculateEggs(int day) {
        if (day == 1) {
            return 1;
        } else if (day == 2) {
            return 2;
        }

        int prevPrev = 1;
        int prev = 2;
        int current = 0;

        for (int i = 3; i <= day; i++) {
            current = 2 * prev * +prevPrev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }
}

// Code author: Vardhan Sanagapalli