// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer");
        int liczba = scan.nextInt();
        if(liczba > 0) {

            System.out.println("The number is positive");
        }
            else if ( liczba < 0 ) {

            System.out.println("The number is negative");
        }
       else {
            System.out.println("The number is 0");
        }



    }
}