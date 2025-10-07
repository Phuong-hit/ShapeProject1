public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getInfo() {
        return "Rectangle - Center: " + centerPoint + ", Width: " + width + ", Height: " + height;
    }
}
