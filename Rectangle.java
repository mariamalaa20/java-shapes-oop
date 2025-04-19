import java.util.Scanner;

public class Rectangle implements ICalculations {
    @Override
    public void calculatePerimeter() {
        System.out.println("Enter the longer side of the rectangle: ");
        Scanner scanner = new Scanner(System.in);
        String longerSide = scanner.nextLine();

        System.out.println("Enter the shorter side of the rectangle: ");
        String shorterSide = scanner.next();

        String result = String.valueOf(2 * Integer.valueOf(shorterSide) + 2 * Integer.valueOf(longerSide));
        System.out.println("Perimeter of the rectangle: " + result);
    }

    @Override
    public void calculateArea() {
        // Not implemented
    }
}
