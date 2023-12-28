package org.softserve.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SystemRedirectService {

    public static void main(String arr[]) throws FileNotFoundException
    {
        PrintStream filePrintStream = new PrintStream(new File("c:\\Users\\user\\test.txt"));
       /* Save the current value of System.out in a separate variable so that later
       we can switch back to console output */

        PrintStream console = System.out;
        // Assign a new value to System.out
        System.setOut(filePrintStream);
        System.out.println("This line will be written to the text file");

        // Restore the old value of System.out
        System.setOut(console);
        System.out.println("But this line will be output to the console!");
    }
}
