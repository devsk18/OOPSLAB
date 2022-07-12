import java.util.Scanner;
 
class UsernameException extends Exception {
 
 public UsernameException(String msg) {
  super(msg);
 }
}
 
class PasswordException extends Exception {
 
 public PasswordException(String msg) {
  super(msg);
 }
}
 
public class Authentication {
 
 public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
    String username, password;
    
    System.out.print("Enter username :: ");
    username = s.nextLine();
    
    System.out.print("\nEnter password :: ");
    password = s.nextLine();
 
    System.out.print("\n");
 
    try {
        if(!username.equals("MCET"))
            throw new UsernameException("Incorrect username - Try again !!!");
        else if(!password.equals("pass123"))
            throw new PasswordException("Incorrect password - Try again !!!");
        else
            System.out.println("\nLogin Successful !!!");
    }
    catch (UsernameException u) {
        u.printStackTrace();
    }
    catch (PasswordException p) {
        p.printStackTrace();
    }
 }
}