package JAVA_OOP_University.Iulian.Lab4;

// Класс для прямоугольника
class RectangleLength extends GeometricFigure {
    public RectangleLength(double width, double height) {
        super(width, height);
    }

    @Override
    public double length() {
        return 2 * (width + height);
    }
}
