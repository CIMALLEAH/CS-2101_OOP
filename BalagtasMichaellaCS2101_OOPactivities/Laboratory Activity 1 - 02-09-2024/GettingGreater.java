import java.util.Scanner;

public class CompareCharacters {
    public static void main(String[] args) {
        
        System.out.println("Getting the Greater Value");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char char1 = scanner.next().charAt(0);

        System.out.print("Enter second character: ");
        char char2 = scanner.next().charAt(0);

        int ascii1 = (int) char1;
        int ascii2 = (int) char2;

        char greaterChar = (char) Math.max(ascii1, ascii2);

        String separator = new String(new char[43]).replace('\0', '-');
        System.out.println(separator);
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println(separator);
        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + " : " + ascii1);
        System.out.println(char2 + " : " + ascii2);
        
        scanner.close();
    }
}
