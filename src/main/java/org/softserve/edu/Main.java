package org.softserve.edu;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //System.in.read() reads bytes

//        while (true) {
//            int x = System.in.read();
//            System.out.println(x);
//        }

        char a = 1049;
        System.out.println(a);

        //The InputStreamReader receives data from the stream and  converts byte streams to character streams.
        InputStreamReader reader = new InputStreamReader(System.in);

        while (true) {
            int x = reader.read();
            System.out.println(x);
        }

    }
}
