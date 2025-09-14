public class s2skipchar {
    public static void main(String[] args) {
        String str = "bacecadhi";
        System.out.println(skip(str));
    }
    static String skip(String str){
        if(str.isEmpty()){
            return str;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return "" + skip(str.substring(1));
        }
        else{
            return ch + skip(str.substring(1));
        }
    }
}
