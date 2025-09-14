public class s1sortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String x = sortSentence(s);
        System.out.println(x);
    }
    static String sortSentence(String s) {
        String[] a= s.split(" ");
        int n = a.length;
        String[] b = new String[n];
        for(int i=0; i<n; i++){
            int l = a[i].length();
            char p = a[i].charAt(l-1);
            int k = p - '0';
            b[k-1] = a[i].substring(0,l-1);  // method
        }
        String str ="";
        for(int i=0; i<n; i++){
            str = str + b[i] + " "; // concatenation
        }
        return str.trim();  // .trim() is used to remove extra space in the last
    }
}

