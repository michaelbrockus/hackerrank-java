//
// file: Main.java
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.util.*;
import java.security.*;


public class Main {

    //
    // function main begins all program execution
    //
    static public void main(String[] args)
    {
      DoNotTerminate.forbidExit();

      try {
              Scanner in = new Scanner(System.in);
              int n = in .nextInt();
              in.close();
              // String s=???; Complete this line below

              // Write your code here


             if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
             } else {
                 System.out.println("Wrong answer.");
             }
         } catch (DoNotTerminate.ExitTrappedException e) {
             System.out.println("Unsuccessful Termination!!");
         }
     } // end of method main

} // end of class
