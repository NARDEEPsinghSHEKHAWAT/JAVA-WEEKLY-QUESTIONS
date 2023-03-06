import java.util.Scanner;

class Circle {

    double radius;

    Circle(double radius) {

        this.radius = radius;

    }

    public double getArea() {

        return 3.14 * radius * radius;

    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 1) {

            System.out.println("Invalid input");

            return;

        }

        Circle[] circles = new Circle[n];

        for (int i = 0; i < n; i++) {

            double radius = sc.nextDouble();

            if (radius < 0.0) {

                radius = 0.0;

            }

            circles[i] = new Circle(radius);

        }

        for (int i = 0; i < n; i++) {

            double area = circles[i].getArea();

            if (area > 30.0) {

                System.out.printf("%.4f\n", area);

            }

        }

    }

}

