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

    //
    // function main begins all program execution
    //
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String line;
        int iter = 1;

        while (input.hasNext())
        {
            line = input.nextLine();
            System.out.println(iter + " " + line);
            iter++;
        } // end while

    } // end of method main

} // end of class
