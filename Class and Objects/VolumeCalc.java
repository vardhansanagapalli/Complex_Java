import java.util.Scanner;

public class VolumeCalculator {

    public double calculateVolume(double radius, double height) {
        return 3.14 * radius * radius * height; // Formula to calculate the volume of a cylinder
    }

    public double calculateVolume(int length, int breadth, int height) {
        return length * breadth * height; // Formula to calculate the volume of a cuboid
    }
}

// Volume calculation main java file.
public class VolumeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator volumeCalculator = new VolumeCalculator();

        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the radius");
            double radius = scanner.nextDouble();
            System.out.println("Enter the height");
            double height = scanner.nextDouble();
            double volume = volumeCalculator.calculateVolume(radius, height);
            System.out.printf("Volume of the Cylinder is %.2f\n", volume);
        } else if (choice == 2) {
            System.out.println("Enter the length");
            int length = scanner.nextInt();
            System.out.println("Enter the breadth");
            int breadth = scanner.nextInt();
            System.out.println("Enter the height");
            int cheight = scanner.nextInt();
            double volume = volumeCalculator.calculateVolume(length, breadth, cheight);
            System.out.printf("Volume of the Cuboid is %.2f\n", volume);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
