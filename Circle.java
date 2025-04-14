import java.util.Scanner;

public class Circle implements ICalculations {
    @Override
    public void calculatePerimeter() {
        System.out.println("Enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        String radius = scanner.nextLine();

        String perimeter = String.valueOf(2 * Math.PI * Integer.valueOf(radius));
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    @Override
    public void calculateArea() {
        // Not implemented
    }

    public void arcCalculation() {
        System.out.println("This method can calculate the arc length.");
    }
}
