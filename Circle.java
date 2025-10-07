public class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public String getInfo() {
        return "Circle - Center: " + centerPoint + ", Radius: " + radius;
    }
}
