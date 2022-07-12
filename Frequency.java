import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = s.nextLine();
        System.out.println("Enter a character : ");
        char ch = s.next().charAt(0);
        int f = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
            	f = f + 1;
            }
        }
        System.out.println("Frequency of " + ch + " = " + f);
    }
}
