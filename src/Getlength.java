import java.util.Scanner;

public class Getlength {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[]args) {
        length();
    }
    public static void length() {
        String x;
        System.out.println("Enter a string: ");
        String stringInp = input.nextLine();
        System.out.println(stringInp.length());
    }
}
