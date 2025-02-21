package JAVA_OOP_University.Iulian.Lab4;

// Демонстрация полиморфизма
public class GeometryTest {
    public static void main(String[] args) {
        GeometricFigure rectangle = new RectangleLength(5, 10);
        GeometricFigure triangle = new IsoscelesTriangleLength(6, 8);

        System.out.println("Длина прямоугольника: " + rectangle.length());
        System.out.println("Длина равнобедренного треугольника: " + triangle.length());
    }
}

