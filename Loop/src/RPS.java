import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
//import java.lang.*

public class RPS {
    public static void main(String[] args){
        Scanner inputObj = new Scanner(System.in);
        System.out.println("please enter R or P or S");
        char serMove = inputObj.next().charAt(0);
        char userMove = Character.toUpperCase(serMove);
        System.out.println("User gave the input ::" + userMove);
        char[] arr ={'R','P','S'};
        Random random = new Random();
        // 0-2
        int guessNumber = random.nextInt(3);
        char computerMove = arr[guessNumber];
        System.out.println("Computer moved::" + computerMove);
        if (computerMove == userMove){
            System.out.println("Draw!!!");
        } else if (computerMove == 'R') {
            if ( userMove =='S') {
                System.out.println("Computer Wins!!");
            }else {
                System.out.println("You Win!!");
            }
        } else if (computerMove == 'S') {
            if ( userMove =='P'){
                System.out.println("Computer Wins");
            }
            else {
                System.out.println("You Win!!");
            }
        }else if (computerMove == 'P') {
            if ( userMove =='R'){
                System.out.println("Computer Wins");
            }
            else {
                System.out.println("You Win!!");
            }
        }
    }
}
