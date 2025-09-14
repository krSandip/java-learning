import static java.lang.Character.isUpperCase;

public class r6firstUpperCase {
    public static void main(String[] args) {
        String str = "sandeeP";
        System.out.println(fxn(str));
    }

    static char fxn(String str){
        char ch = str.charAt(0);
        if(isUpperCase(ch)){
            return ch;
        }
        return fxn(str.substring(1));
    }
}
