import java.io.*;
import java.util.Scanner;
public class Challenge {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // try {
            System.out.println("Enter first number:");
            //a = Integer.parseInt(br.readLine());
            a = scan.nextInt();
            System.out.println("Enter second number:");
            //b = Integer.parseInt(br.readLine());
            b=scan.nextInt();
            System.out.println("Enter third number:");
            //c = Integer.parseInt(br.readLine());
            c=scan.nextInt();
            System.out.println("you entered the following numbers: " + "\n first number: " + a + "\n second number: "
                    + b + "\n third number: " + c);
       // } catch (IOException e) {

        //    System.out.println(e);
       // }
    }

}