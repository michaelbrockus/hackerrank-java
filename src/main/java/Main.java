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
    private static final int MAX_ITER = 11;

    //
    // function main begins all program execution
    //
    static public void main(String[] args)
    {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int iter = 1; iter < MAX_ITER; ++iter) {
            System.out.printf("%d x %d = %d %n", N, iter, N * iter);
        } // end for

        scanner.close();
    } // end of method main

} // end of class
