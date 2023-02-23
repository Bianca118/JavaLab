package ex1;

import java.util.Scanner;

public class FisrtApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lungime= ");
        int lung= scan.nextInt();
        System.out.println("Latimea= ");
        int lat=scan.nextInt();
        System.out.println("Perimetrul este: "+(2*(lat+lung)));
        System.out.println("Aria: "+(lung*lat));
    }

}
