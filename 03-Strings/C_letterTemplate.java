
import java.util.Scanner;

public class C_letterTemplate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String letter = "Dear <|name|> , Thanks a lot.";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
        sc.close();
    }
}
