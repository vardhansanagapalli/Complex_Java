import java.util.Scanner;

public class swappingwithoutvariables {

    public static void main(String[] args)     int a, b;
        Scanne r sc = new Scanner(System.in);
        System.out . println("Enter value of a: ");
        a = sc.nextInt();
        S y stem.out.println("Enter value of b: ");
        b = sc.nextInt();
        S y stem.out.println("Value of a before swapping is " + a);
        System.out.println("Value of a before swapping is "   + b);
        a = a - b;  
        b   =   b + a;
        a   =   b - a;
        S y s t em.out.println("Value of a after swapping is " + a);
        System.out.println("Value of b after swapping is "   + b);
    }  
}