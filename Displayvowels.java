import java.util.Scanner;
public class Displayvowels
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.print("vowels in the given string:");
        for (char ch : input.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch) != -1)
            {
                System.out.println(ch + "");
            }
        }
    }
}
