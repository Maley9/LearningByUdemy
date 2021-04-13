package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        try{

            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream stream = url.openStream();
            BufferedReader read = new BufferedReader(
                    new InputStreamReader(stream)
            );

            String line = null;

            while ((line = read.readLine()) !=null ){
                System.out.println(line);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
