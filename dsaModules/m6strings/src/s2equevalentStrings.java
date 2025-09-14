public class s2equevalentStrings {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean x = arrayStringsAreEqual(word1, word2);
        System.out.println(x);
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m = word1.length;
        int n = word2.length;
        String a = "";
        for(int i=0; i<m; i++){
            a = a + word1[i];
        }
        String b = "";
        for(int i=0; i<n; i++){
            b = b + word2[i];
        }

        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }


    }
}
