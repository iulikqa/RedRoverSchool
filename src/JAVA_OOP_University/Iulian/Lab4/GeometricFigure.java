package JAVA_OOP_University.Iulian.Employees.Lab4;

// Абстрактный класс с общими свойствами
abstract class GeometricFigure implements GeometricLength {
    protected double width;
    protected double height;

    public GeometricFigure(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public abstract double length(); // Абстрактный метод
}