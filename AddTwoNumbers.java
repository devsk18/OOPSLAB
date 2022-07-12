import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
