import java.util.Scanner;
import java.util.Vector;

public class Vectorlearning {
    public static void main(String[] args) {
        Scanner getdat = new Scanner(System.in);
        Vector arr = new Vector();
        char yn;
        do {
            System.out.println("Enter value of vector");
            int vec = getdat.nextInt();
            arr.add(vec);
            System.out.println("Do you want to add?(y/n)");
            yn = getdat.next().charAt(0);

        }while (yn!='n');
        System.out.println(arr);
    }
}
