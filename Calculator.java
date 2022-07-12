import java.util.*;
interface Math{
    public double add(double a,double b);
    public double sub(double a,double b);
    public double mul(double a,double b);
    public double div(double a,double b);
}
class Operation implements Math {
    public double add(double a, double b){
        return a+b; 
    }
    public double sub(double a, double b){
        return a-b;
    }
    public double mul(double a, double b){
        return a*b;
    }
    public double div(double a, double b){
        return a/b;
    }
    public void display(double a, double b){
        System.out.println("---------Calculator---------\n");
        System.out.println("Addition value is: " + add(a,b));
        System.out.println("Subtraction value is: " + sub(a,b));
        System.out.println("Multiplication value is: " + mul(a,b));
        System.out.println("Divition value is: " + div(a,b));
    }
}
class Calculator {
    public static void main(String args[]){
        Operation n = new Operation();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a = s.nextDouble();
        double b = s.nextDouble();
        n.display(a,b);
    }
}