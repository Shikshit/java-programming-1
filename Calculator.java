import java.lang.FunctionalInterface;
import java.util.Scanner;

@FunctionalInterface
interface myinterface{
    double soln(float a, float b);
}

public class Calculator {
    public int add(int a,int b){
        myinterface ref= (c,d) -> {
            double result = 0;
            c=a;
            d=b;
            result=c+d;
            return result;
        } ;

        System.out.println("Your Solution = " + ref.soln(a,b));
        return 0;
    }
    public int difference(int a,int b){
        myinterface ref= (c,d) -> {
            double result = 0;
            c=a;
            d=b;
            result=c-d;
            return result;
        } ;

        System.out.println("Your Solution = " + ref.soln(a,b));
        return 0;
    }
    public int product(int a,int b){
        myinterface ref= (c,d) -> {
            double result = 0;
            c=a;
            d=b;
            result=c*d;
            return result;
        } ;

        System.out.println("Your Solution = " + ref.soln(a,b));
        return 0;
    }
    public int safeDivision(int a,int b){
        myinterface ref= (c,d) -> {
            float result = 0;
            c=a;
            d=b;
            result=c/d;
            return result;
        } ;

        System.out.println("Your Solution = " + ref.soln(a,b));
        return 0;
    }

    public static void main( String[] args ) {
        Scanner input= new Scanner(System.in);
        Calculator obj= new Calculator();
        System.out.println("Enter digit from 1-4 for specific operations: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
        int num= input.nextInt();
        System.out.println("Enter two variables");
        switch(num){
            case 1:
                obj.add(input.nextInt(), input.nextInt());
                break;
            case 2:
                obj.difference(input.nextInt(), input.nextInt());
                break;
            case 3:
                obj.product(input.nextInt(), input.nextInt());
                break;
            case 4:
                obj.safeDivision(input.nextInt(), input.nextInt());
        }

    }
}