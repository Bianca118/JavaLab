package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecApp {
    public static void main(String[] args) throws IOException {

        String nume_fis= "in.txt ";
        int suma=0;
        BufferedReader flux_in;
        flux_in = new BufferedReader(new FileReader(nume_fis));
        String citim= flux_in.readLine();
        while(!citim.equals("0")) {

            System.out.println("ati introdus "+citim);
            citim =flux_in.readLine();
            suma+= Integer.parseInt(citim);
        }

        System.out.println("suma: "+suma);
    }
}
