//
// file: Main.java
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.util.*;
import java.io.*;


public class Main {

    //
    // function main begins all program execution
    //
    static public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; ++i)
        {
            try
            {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                try {
                    byte y = (byte)x;
                    if(y == x) {
                        System.out.println("* byte");    
                    } // end if
                } catch(Exception e){} // end try
                try {
                    short y = (short)x;
                    if (y == x) {
                        System.out.println("* short");
                    } // end if
                } catch(Exception e) {} // end try
                try {
                    int y = (int)x;
                    if(y == x) {
                        System.out.println("* int");
                    } // end if
                } catch(Exception e){} // end try
                
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            } // end try

        } // end for

        sc.close();

    } // end of method main

} // end of class
