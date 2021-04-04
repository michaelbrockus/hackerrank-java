//
// file: Main.java
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//


public class Main {

    //
    // function main begins all program execution
    //
    static public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // Printing a formatted string in one line of Java
            System.out.printf("%-14s %03d %n", s1, x);

        } // end for
        System.out.println("================================");
    } // end of method main

    sc.close(); // We close this to avoid memory leek

} // end of class
