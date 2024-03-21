
/*
 * The fourth standard teacher teaches the area of Basic Shapes to the students.
 * The teacher shows certain shapes, the student is asked to identify the shapes
 * based on the number of sides and calculate the area. Write a java program to
 * find the shape and calculate the area.
 * If the number of sides is 0, it is a circle. Get the radius and calculate the
 * area using the formula area of circle = 3.14 * radius * radius.
 * If the number of sides is 3, it is a triangle. Get the base and height and
 * calculate the area using the formula area of triangle = (base * height)/2.
 * If the number of sides is 4, get the length and breadth. If the length and
 * breadth are equal, it is a square. Calculate the area using the formula area
 * of square = length * length. If the length and breadth are different, it is a
 * rectangle. Calculate the area using the formula area of rectangle= length *
 * breadth.
 * If any other value is entered for the number of sides, print "Invalid side".
 * Note:
 * Area should have only 2 decimal places.
 * In the Sample Input / Output provided, the highlighted text in bold
 * corresponds to the input given by the user, and the rest of the text
 * represents the output.
 * Ensure to follow the object-oriented specifications provided in the question
 * description.
 * Ensure to provide the names for classes, attributes, and methods as specified
 * in the question description.
 * Adhere to the code template, if provided.
 * 
 * Please do not use System.exit(0) to terminate the program.
 */
import java.util.Scanner;

public class AreaoftheShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int sides = sc.nextInt();
        switch (sides) {
            case 0:
                calculateCircleArea(sc);
                break;
            case 3:
                calculateTriangleArea(sc);
                break;
            case 4:
                calculateSquareorRectangleArea(sc);
                break;
            default:
                System.out.println("Invalid side");
        }
        sc.close();
    }

    private static void calculateCircleArea(Scanner sc) {
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.printf("Area of the Circle is %.2f\n", area);
    }

    private static void calculateTriangleArea(Scanner sc) {
        System.out.println("Enter the base and height: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.printf("Area of the Triangle is %.2f\n", area);
    }

    private static void calculateSquareorRectangleArea(Scanner sc) {
        System.out.println("Enter the length: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth: ");
        double breadth = sc.nextDouble();
        if (length == breadth) {
            double area = length * length;
            System.out.printf("Area of the Square is %.2f\n", area);
        } else {
            double area = length * breadth;
            System.out.printf("Area of the Rectangle is %.2f\n", area);
        }
    }
}

// Code author: Vardhan Sanagapalli