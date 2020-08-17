import java.util.Scanner;
public class Rectangle {
    int width, height;
    void display(int w, int h)
    {
        System.out.println("Width: "+w+" "+"Height: "+h);
    }
}
class RectangleArea extends Rectangle{

    void read_input(){
        Scanner sc= new Scanner(System.in);
        width= sc.nextInt();
        height=sc.nextInt();
        display(width,height);
    }
    void display()
    {
        System.out.println("Area of Rectangle is "+ width*height);
    }

    public static void main(String[] args)
    {
        RectangleArea obj= new RectangleArea();
        obj.read_input();
        obj.display();
    }
}
