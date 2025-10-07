import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        // Danh sách hình
        ArrayList<Shape> shapes = new ArrayList<>();

        // Tạo hình
        shapes.add(new Rectangle(new Point(1, 1), 4, 6));
        shapes.add(new Square(new Point(2, 3), 5));
        shapes.add(new Circle(new Point(0, 0), 2.5));
        shapes.add(new Rectangle(new Point(5, -1), 3, 7));
        shapes.add(new Square(new Point(-2, 4), 4));

        //Số lượng hình
        System.out.println("Số lượng hình: " + Shape.getCount());

        //Danh sách các hình
        System.out.println("\nDanh sách các hình:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getInfo());
        }

        // Danh sách tâm điểm
        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getCenterPoint());
        }
    }
}
