import java.util.*;
public class ComplexSum
{
    int real,imaginary;
    ComplexSum(int r,int i)
    {
        this.real = r;
        this.imaginary = i;
    }
    public static ComplexSum add(ComplexSum a,ComplexSum b)
    {
        ComplexSum k = new ComplexSum(0,0);
        k.real = a.real + b.real;
        k.imaginary = a.imaginary + b.imaginary;
        return k;
    }
    public String show()
    {
        return this.real + " + i" + this.imaginary;
    }
    public static void main(String args[])
    {
        ComplexSum a = new ComplexSum(5,9);
        ComplexSum b = new ComplexSum(4,7);
        System.out.println("First Complex no: " + a.show());
        System.out.println("First Complex no: " + b.show());

        ComplexSum c = add(a,b);

        System.out.println("Sum of above complex nos: " + c.show());
    }
}