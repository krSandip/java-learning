import java.util.Scanner;
public class c3alphabetCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char word = input.next().trim().charAt(0);
        if(word>='a'&& word<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}