//
// file: Main.java
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {
    static Scanner input = new Scanner(System.in);
    static int B = input.nextInt();
    static int H = input.nextInt();
    static Boolean flag = B > 0 && H > 0;

    static {

        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } // end if

    } // end static block

    //
    // function main begins all program execution
    //
    static public void main(String[] args)
    {
        if (flag) {
			int area = B * H;
			System.out.print(area);
		} // end if

    } // end of method main

} // end of class
