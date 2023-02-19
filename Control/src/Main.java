import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner getdat = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int value1 = getdat.nextInt();
        System.out.println("Enter your 2nd number");
        int value2 = getdat.nextInt();
        System.out.println("Press \n 1 for add \n 2 for subtract \n 3 for multiply");
        int choice = getdat.nextInt();
        switch(choice){
            case 1:
                System.out.println(value1+value2);
                break;
            case 2:
                System.out.println(value1-value2);
                break;
            case 3:
                System.out.println(value1*value2);
        }
    }
}