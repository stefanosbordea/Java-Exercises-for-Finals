public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;

    }

    public void describe() {
        System.out.printf("Color is %s",color);
    }
}