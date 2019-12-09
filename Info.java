package info;
import java.util.Scanner;
public class Info {  
   public static void main(String[] args) {
      Scanner scn = new Scanner (System.in);
      System.out.println("Hello"); 
      System.out.println("What is your name?");
      String name = scn.nextLine();
      System.out.println("you name is " + name);
      System.out.println("How old are you?");
      String age = scn.nextLine();
      System.out.println ("you are is "+ age);
      System.out.println ("What is you address?");
      String address = scn.nextLine ();
      System.out.println (" your address is " + address);
   
    }
    
}
