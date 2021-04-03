//
// file: Main.java
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    //
    // function main begins all program execution
    //
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 == 1) {
            System.out.println("Weird");
        } // end if
        else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } // end else if
        else if (N >= 6 && N <= 20) { 
            System.out.println("Weird");
        } // end else if
        else if (N > 20) {
            System.out.println("Not Weird");
        } // end else if

        scanner.close();
    } // end of method main
    
} // end of class
