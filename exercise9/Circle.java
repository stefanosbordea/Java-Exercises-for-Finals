public class Circle extends Shape {
    double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void describe() {
        System.out.printf("Color is %s%n",color);
        System.out.printf("Area is %.2f%n",Math.PI*Math.pow(radius, 2));
    }
}