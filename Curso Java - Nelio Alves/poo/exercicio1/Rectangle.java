package poo.exercicio1;

public class Rectangle {
    public double width; // largura (base)
    public double height; // Altura

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        double d = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(d);
    }

    public String toString() {
        return "AREA = " + String.format("%.2f\n", area())
                + "PERIMETER = " + String.format("%.2f\n", perimeter())
                + "DIAGONAL = " + String.format("%.2f\n", diagonal());
    }
}
