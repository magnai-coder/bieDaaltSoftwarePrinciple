import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner intLine = new Scanner(System.in);
        String input = intLine.nextLine();
        Lexer result = new Lexer(input);
    }
}
