public class s1skipChar {
    public static void main(String[] args) {
        String str = "baccad";
        String ans  = "";
        skip(str, ans);
    }
    static void skip(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skip(str.substring(1), ans);
        }
        else{
            skip(str.substring(1), ans + ch);
        }
    }
}