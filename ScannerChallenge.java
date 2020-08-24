import java.util.Scanner;

public class ScannerChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
        scan.close();
    }
}