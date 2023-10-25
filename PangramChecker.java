import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Sentence");
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);
        
        if (isPangram){
            System.out.println("Entered sentence is pangram.");
        }
        else {
            System.out.println("Entered sentence is not pangram.");
        }
    }

    public static boolean isPangram(String input) {
        boolean[] letters = new boolean[26];
        int totalLetters = 0;

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    totalLetters++;
                }
            }
        }

        return totalLetters == 26;
    }
}
