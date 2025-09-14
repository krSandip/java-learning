/*
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */
import java.util.Scanner;
public class a11pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        System.out.println(checkIfPangram(sentence));

    }
    public static boolean checkIfPangram(String sentence) {
        char i='a';
        for(int j=0;j<26; j++){
            if(sentence.contains(String.valueOf(i))){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
