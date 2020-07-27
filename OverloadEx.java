import java.util.*;
class Multiply {
    void mul(int a, int b) {
        System.out.println("Sum of two=" + (a * b));
    }

    void mul(int a, int b, int c) {
        System.out.println("Sum of three=" + (a * b * c));
    }
}
public class OverloadEx {

    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter first number");
int a=sc.nextInt();
System.out.println("\n Enter Second number");
int b=sc.nextInt();
System.out.println("\n Enter Third number");
int c=sc.nextInt();
        Multiply m = new Multiply();
        m.mul(a, b);
        m.mul(a, b, c);
    }
}