import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
            Scanner intLine = new Scanner(System.in);
            String input = intLine.nextLine();
            Lexer checkIt = new Lexer(input);
            For print = checkIt.divideCheckCode();
            System.out.println(print.toString());  
        } 
    }

 