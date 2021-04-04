
//
// file: Main.java
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.util.*;
import java.security.*;


//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
        @Override public void checkPermission(Permission permission) {
            if (permission.getName().contains("exitVM")) {
                throw new ExitTrappedException();
                } // end if
            } // end internal method
        }; // end of SecurityManager block
        System.setSecurityManager(securityManager);
    } // end of method forbidExit
} // end class
