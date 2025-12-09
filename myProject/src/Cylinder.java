public class Cylinder extends Circle{
    private double height=1.0;
    Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea() {
        return (2*Math.PI*getRadius()*height) + (2*getRadius()*getRadius()*Math.PI);
    }

    @Override
    public String toString() {
        return "Cylinder: radius=" + getRadius() + " color=" + getColor() + " height=" + getHeight();
    }
    public double getVolume(){
        return 2*Math.PI*getHeight()*getRadius()*getRadius();
    }

}
