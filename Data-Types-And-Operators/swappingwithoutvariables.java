import java.util.Scanner;

public class swappingwithoutvariables {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        System.out.println("Value of a before swapping is " + a);
        System.out.println("Value of a before swapping is " + b);
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println("Value of a after swapping is " + a);
     
    }
}

//Code Author Vardhan Sanagapalli
