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
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int calc = a;

            for(int j = 0; j < n; ++j)
            {
                calc += (Math.pow(2, j) * b);
                System.out.print(calc + " ");
            } // end for
            System.out.println();
        } // end for

        in.close();
    } // end of method main

} // end of class
