public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color,double width,double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public void describe() {
        System.out.printf("Color is %s%n",color);
        System.out.printf("Area - %.2f%n",width*height);
    }

}