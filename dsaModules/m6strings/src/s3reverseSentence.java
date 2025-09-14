public class s3reverseSentence {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        System.out.println(str);
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length; i++){
            String subStr = str[i];
            int j = subStr.length()-1;
            while(j>=0){
                result.append(subStr.charAt(j));
                j--;
            }
            if(i< str.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}