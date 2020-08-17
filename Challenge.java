import java.io.*;

public class Challenge {
    public static void main(String[] args) {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter first number:");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter second number:");
            b = Integer.parseInt(br.readLine());
            System.out.println("Enter third number:");
            c = Integer.parseInt(br.readLine());
            System.out.println("you entered the following numbers: " + "\n first number: " + a + "\n second number: "
                    + b + "\n third number: " + c);
        } catch (IOException e) {

            System.out.println(e);
        }
    }

}