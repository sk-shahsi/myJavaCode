public class TestArea {
    public static void main(String[] args) {
        int redius=4;
        int height = 10;
        Circle ch = new Circle(redius);
        Cylinder c = new Cylinder(redius,height);

        System.out.println(ch.toString());
        System.out.println(c.toString());
        System.out.println(ch.getArea());
        System.out.println(c.getArea());
    }
}
