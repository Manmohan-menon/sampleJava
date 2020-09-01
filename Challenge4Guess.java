import java.util.Scanner;

public class Challenge4Guess
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
    System.out.println("Hello! What is your name?");

   String name = scan.nextLine();
   int count = 0;
   int a = 1 + (int) (Math.random() * 20);
   int guess = 0;

   System.out.println("Well, "+name+", I am thinking of a number between 1 and 20.Take a guess: \n");

   while (guess != a && count<=6) {
       guess = scan.nextInt();
       count++;
       if (guess > a) {
           System.out.println("Your guess is too high! Take a guess.");
       } else if (guess < a) {
           System.out.println("Your guess is too low! Take a guess.");
       }else{
            System.out.println("Congratulations. You guessed the number within "
       + count + " tries!");
       }
   }   
       if(count>6){
        System.out.println("Congratulations. Your guess has exceeded your alloted tries ! max tries for each:6 and you already have: "
        + count + " tries! Game over!");
        scan.close();    
       }
  }
}