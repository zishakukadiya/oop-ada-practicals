import java.util.Scanner;

class VowelChecker {
    private char ch;

    void setCharacter(char ch) {
        this.ch = ch;
    }

    boolean isLetter() {
        return Character.isLetter(ch);
    }

    boolean isVowel() {
        char lower = Character.toLowerCase(ch);
        return "aeiou".indexOf(lower) != -1;
    }

    void display() {
        if (!isLetter()) {
            System.out.println("'" + ch + "' is not a letter.");
            return;
        }
        if (isVowel()) {
            System.out.println("'" + ch + "' is a Vowel.");
        } else {
            System.out.println("'" + ch + "' is a Consonant.");
        }
    }
}

public class PBL3_VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        VowelChecker vc = new VowelChecker();
        vc.setCharacter(ch);
        vc.display();

        sc.close();
    }
}
