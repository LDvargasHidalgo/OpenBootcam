package Basico;

//Scanner.skip nos sirve para omitir una palabra que deseemos de nuestro string
import java.util.*;
public class CannerSkip {
        public static void main(String[] args) {

            String s = "Hello World! 3 + 3.0 = 6.0 true ";

            // create a new scanner with the specified String Object
            Scanner scanner = new Scanner(s);

            // skip the word "Hello"
            scanner.skip("Hello");

            // print a line of the scanner
            System.out.println(""+scanner.nextLine());

            //close the scanner
            scanner.close();
        }
    }

