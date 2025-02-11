package JAVA_OOP_University.Iulian.Employees.Lab4;

// Класс для равнобедренного треугольника
class IsoscelesTriangleLength extends GeometricFigure {
    public IsoscelesTriangleLength(double base, double side) {
        super(base, side);
    }

    @Override
    public double length() {
        return width + 2 * height;
    }
}