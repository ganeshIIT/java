import java.util.Scanner;

public class EchoLine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hey there is an echo here");
        System.out.println(keyboard.nextLine());
        keyboard.close();
    }
}