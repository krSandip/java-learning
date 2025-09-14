// Q : To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class f11palindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" enter the word : ");
        String word = input.nextLine();
        String temp = "";
        int wordLength = word.length();

        for(int i = (wordLength - 1); i>=0; i--){
            temp = temp + word.charAt(i);
        }

        if(word.toLowerCase().equalsIgnoreCase(temp.toLowerCase())){
            System.out.println(word+ " is a palindrome string.");
        }
        else{
            System.out.println(word+ " is not a palindrome string.");
        }
    }
}
