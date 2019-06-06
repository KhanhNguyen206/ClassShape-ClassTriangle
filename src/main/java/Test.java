import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter 3 side of triangle: ");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Side 1: ");
        double side1= scanner.nextDouble();
        System.out.println("Side 2: ");
        double side2= scanner.nextDouble();
        System.out.println("Side 3: ");
        double side3=scanner.nextDouble();

        Triangle triangle=new Triangle(side1, side2, side3);

        System.out.println(triangle.toString());
    }
}
