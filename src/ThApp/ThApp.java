package ThApp;

import java.util.Scanner;

public class ThApp {
    public static void main(String[] args) {
int i;
int ok=1;
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
for(i=2;i<n;i++)

    if(n%i==0)
    {
        System.out.println("Divizor "+i);
        ok=0;
    }
    if(ok==1)

        System.out.println("E prim");
    else
            System.out.println("Nu e");


    }
}
