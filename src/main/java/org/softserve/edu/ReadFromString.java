package org.softserve.edu;

import java.io.*;

public class ReadFromString {

    public static void main(String[] args) throws IOException {

        String greetings = "Hi! My name is Amigo!\nI'm learning Java on the CodeGym website.\nOne day I will become a cool programmer!\n";
        byte[] bytes = greetings.getBytes();

        /*
        System.in is usually bound to the keyboard.
        The thing is that InputStream is an abstract class, so we can't create an instance of it directly.
        We have to choose one of its descendants - ByteArrayInputStream.
         */
        InputStream inputStream = new ByteArrayInputStream(bytes);

        //Now we just need to use the System.setIn() method to explicitly set the value of the in variable.
        System.setIn(inputStream);

        /*
        When BufferedReader reads data, it uses a special area called a buffer, where it "stores" the characters it reads.
        Ultimately, when these characters are needed in the program, they will be taken from the buffer,
        not directly from the data source (keyboard, file, etc.). This saves a lot of resources, increase performance
        and convenience, by using the readLine() method read whole lines at a time.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = reader.readLine()) != null) {

            System.out.println(str);
        }

    }
}
