import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        //Гаднаас for(x=3;x<5;x++) өгөгдөл орно
            Scanner intLine = new Scanner(System.in);
            String input = intLine.nextLine();
            Lexer checkIt = new Lexer(input);
        //Орж ирсэн оролтын Lexer класс ашиглан ялгаж алдааг илрүүлэх боломжтой болгон.
            For print = checkIt.divideCheckCode();
        //Оролтын өгүүлбэр зүй утга зүйг шалгаж бүрэн болсон үр дүнг toString-ээр хэвлэн.
            System.out.println(print.toString());  
        } 
    }

 