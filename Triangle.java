import java.lang.Math;
import java.util.Scanner;
public class Triangle {
    public static int arrea(double a, double b, double c){
        double area = 0,initial,peri=0;
        peri=(a+b+c)/2;
        initial = peri * (peri-a) * (peri-b) * (peri-c);
        area=Math.sqrt(initial);
        return (int) area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three lengths of the triangle");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        int temp= arrea(a,b,c);
        System.out.println(temp);
    }
}