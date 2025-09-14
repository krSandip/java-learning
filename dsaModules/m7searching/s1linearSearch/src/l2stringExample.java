public class l2stringExample {
    public static void main(String[] args) {
        String name = "sandeep";
        char target = 'e';
        System.out.println(search(name,target));
    }

    // print the index where target found in string otherwise print -1
    static int search(String str, char target){
        if(str.length()==0){
            return -1;
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
