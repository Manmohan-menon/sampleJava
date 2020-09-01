import java.io.*;
import java.util.Scanner;
public class Challenge {
    public static void main(String[] args) {
        int a, b, c, d,e, f;
        Scanner scan = new Scanner(System.in);        
        	long start_time=System.currentTimeMillis();
            System.out.println("Enter first number:");
            a = scan.nextInt();
            System.out.println("Enter second number:");
            b=scan.nextInt();
            System.out.println("Enter third number:");
            c=scan.nextInt();
            long end_time = System.currentTimeMillis()-start_time;
            System.out.println("total time took: "+end_time+"you entered the following numbers: " + "\n first number: " + a + "\n second number: "
                    + b + "\n third number: " + c);
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             try {    
            	 long start_newTime=System.currentTimeMillis();
                 System.out.println("Enter first number:");
                 d = Integer.parseInt(br.readLine());
                 System.out.println("Enter second number:");
                 e = Integer.parseInt(br.readLine());
                 System.out.println("Enter third number:");
                 f = Integer.parseInt(br.readLine());
                 long end_newTime = System.currentTimeMillis()-start_newTime;
                 System.out.println("total time took: "+end_newTime+"you entered the following numbers: " + "\n first number: " + d + "\n second number: "
                         + e + "\n third number: " + f);
            System.out.println("time difference between scanner: "+end_time+ ",\n and bufferedReader class: "+end_newTime);
        } catch (IOException ex) {

           System.out.println(ex);
       }
    }

}