package org.softserve.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteToFile {
    private static final String GREETINGS_MESSAGE = "My name is %s. I am %d!\n";
    public static void main(String arr[]) throws FileNotFoundException
    {
        PrintStream filePrintStream = new PrintStream(new File("c:\\Users\\user\\test.txt"));

        filePrintStream.println(222);
        filePrintStream.println("Hello world");
        filePrintStream.println(false);

        filePrintStream.println("Hello!");
        filePrintStream.println("We are robots!");


        filePrintStream.printf(GREETINGS_MESSAGE, "Amigo", 18);
        filePrintStream.printf(GREETINGS_MESSAGE, "R2-D2", 35);
        filePrintStream.printf(GREETINGS_MESSAGE, "C-3PO", 35);

        filePrintStream.close();

    }
}