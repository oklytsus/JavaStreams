package org.softserve.edu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class FileURLReader {

    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://www.oracle.com/index.html");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

        FileInputStream fileInputStream = new FileInputStream("testFile.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        String str;

        while ((str = reader.readLine()) != null)   {
            System.out.println (str);
        }

        reader.close();
    }
}
