import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        String abc = "abcdefghijklmnopqrstuvwxyz";

        String letterAsk = "f";
        System.out.println("Guess a letter A-Z");
        Scanner scan = new Scanner(System.in);
        String letterUser = scan.nextLine();

              while (!letterAsk.equalsIgnoreCase(letterUser)) {

                  int indexOfAsk = abc.indexOf(letterAsk);
                  int indexOfUser = abc.indexOf(letterUser);

                  if (indexOfAsk<indexOfUser){
                      System.out.println("You're too low. Try again");
                  }else if (indexOfAsk>indexOfUser){
                      System.out.println("You're too high. Try again");
                  }

                  letterUser = scan.nextLine();

              }
              System.out.println("You winn");


    }
}
