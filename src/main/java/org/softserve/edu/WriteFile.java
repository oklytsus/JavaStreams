package org.softserve.edu;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String[] list = {"one", "two", "three", "fo"};
        try {
            File file = new File("c:\\Users\\user\\test.txt");
            FileWriter fileReader = new FileWriter(file); // A stream that connects to the text file
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // Connect the FileWriter to the BufferedWriter

            for (String s : list) {
                bufferedWriter.write(s + "\n");
            }

            bufferedWriter.close (); // Close the stream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
