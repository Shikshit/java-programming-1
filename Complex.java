import java.util.Scanner;
public class Complex {
    double real, imaginary;
    Complex(double r, double i){
        this.real=r;
        this.imaginary=i;
    }
    public static Complex add(Complex num1,Complex num2){
        Complex temp1 =new Complex(0,0);
        temp1.real = num1.real + num2.real;
        temp1.imaginary = num1.imaginary + num2.imaginary;
        return temp1;
    }
    public static Complex difference(Complex num1,Complex num2){
        Complex temp2 =new Complex(0,0);
        temp2.real = num1.real - num2.real;
        temp2.imaginary = num1.imaginary - num2.imaginary;
        return temp2;
    }
    public static Complex product(Complex num1,Complex num2){
        Complex temp3 =new Complex(0,0);
        temp3.real = num1.real * num2.real;
        temp3.imaginary = num1.imaginary * num2.imaginary;
        return temp3;
    }
    public static void main( String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter First real and imaginary number");
        Complex num1 = new Complex(input.nextDouble(),input.nextDouble());
        System.out.println("Enter Second real and imaginary number");
        Complex num2 = new Complex(input.nextDouble(),input.nextDouble());
        Complex temp1 = add(num1,num2);
        Complex temp2 = difference(num1,num2);
        Complex temp3 = product(num1,num2);
        System.out.println("Addition: " + temp1.real +" + "+ temp1.imaginary+"i");
        System.out.println("Difference: " + temp2.real +" + "+ temp2.imaginary+"i");
        System.out.println("Product: " + temp3.real +" + "+ temp3.imaginary+"i");
    }
}
