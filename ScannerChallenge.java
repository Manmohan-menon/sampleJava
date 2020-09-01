import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerChallenge {

    public static void main(String[] args) {
    	 long start_time=System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
         
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
        //scan.close();
        long end_time=System.currentTimeMillis()-start_time;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {    
       	 long start_newTime=System.currentTimeMillis();
       	 	
            System.out.println("Enter first number:");
            String inputString = br.readLine();
            int a = Integer.parseInt(inputString);
           
            System.out.println("Enter second number:");
            String inputString1 = br.readLine();
            double b = Double.parseDouble(inputString1);
            
            System.out.println("Enter third number:");
            String inputString2 = br.readLine();
           String c = inputString2;
            long end_newTime = System.currentTimeMillis()-start_newTime;
            System.out.println("total time took: "+end_newTime+"you entered the following numbers: " + "\n first number: " + a + "\n second number: "
                    + b + "\n third number: " + c);
       System.out.println("time difference between scanner: "+end_time+ ",\n and bufferedReader class: "+end_newTime);
   } catch (IOException ex) {

      System.out.println(ex);
  }
    }
}