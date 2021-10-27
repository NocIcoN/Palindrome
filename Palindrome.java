package MukhammadIlhamFirdaus;
//21.51.0008
import java.util.Scanner;

public class Palindrome {
    // if you put word containt "ng" or "ny" that's shouldn't changed to "gn" or "yn"
    public static void main(String[] args) {
        String input;
        String output = "";
        String set = "";
        Scanner word = new Scanner(System.in);
        System.out.println("Put Your Word or Sentences Here");
        input = word.nextLine();
        for (int y = input.length() - 1; y >= 0; y--) {
            char x = input.charAt(y);
            set = String.valueOf(x);
            if (set.equalsIgnoreCase("g")){
                char c1 = input.charAt(y-1);
                String set1 = String.valueOf(c1);
                if (set1.equalsIgnoreCase("n")){
                    output += input.charAt(y -1);
                    y -= 1;
                }
            }
            if (set.equalsIgnoreCase("y")){
                char c1 = input.charAt(y-1);
                String set1 = String.valueOf(c1);
                if (set1.equalsIgnoreCase("n")){
                    output += input.charAt(y -1);
                    y -= 1;
                }
            }
            output += x;
        }

        System.out.println("The Value " + output);

        for (int y = input.length() - 1; y >= 0; y--) {
            char x = input.charAt(y);
            set += String.valueOf(x);
        }
        System.out.println("Mission Succes");
    }
}
