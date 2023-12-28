package org.softserve.edu;

import java.io.*;

class ConsoleRead {
    public static void main(String[] args) {
        try {
            File file = new File("c:\\Users\\user\\test.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // A stream for reading from the console
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // Connect InputStreamReader to a BufferedReader

            FileWriter fileReader = new FileWriter(file); // A stream that connects to the text file
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // Connect the FileWriter to the BufferedWriter

            String line;
            while(!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line);
            }

            bufferedReader.close(); // Close the stream
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
