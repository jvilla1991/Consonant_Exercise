import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	String userInput;

        System.out.println("Enter in some text: ");
        userInput = scnr.nextLine();

        int vowel = 0;

        for (int i = 0; i < userInput.length(); ++i)
        {

                if (userInput.charAt(i) == 'a')
                {
                    vowel++;
                }
                else if (userInput.charAt(i) == 'e')
                {
                    vowel++;
                }
                else if (userInput.charAt(i) == 'i')
                {
                    vowel++;
                }
                else if (userInput.charAt(i) == 'o')
                {
                    vowel++;
                }
                else if (userInput.charAt(i) == 'u')
                {
                    vowel++;
                }
                else if (userInput.charAt(i) == ' ')
                {
                    vowel++;
                }
        }

        System.out.print("The number of consonants in your word/sentence is " + (userInput.length() - vowel));

        }


}