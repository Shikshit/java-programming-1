public class Circle {
    private double radius;
    private String color;

    public Circle()
    {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r)
    {
        radius = r;
    }
    public void getRadius()
    {
        System.out.println("Radius of a Circle: "+radius);
    }
    public void getArea()
    {
        System.out.println("Area of a Circle: "+ radius*radius*Math.PI);
    }
    public static void main(String[] args)
    {
        Circle obj= new Circle();
        obj.getRadius();
        obj.getArea();
    }
}
