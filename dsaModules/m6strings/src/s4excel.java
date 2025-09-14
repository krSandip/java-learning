public class s4excel {
    public static void main(String[] args) {
        int n = 2100;
        String ans = recursion(n);
        System.out.println(ans);
    }
    static String recursion(int n){
        StringBuilder result = new StringBuilder();
        int x = n/26;
        int y = n%26;
        if(x>26){
            if(y!=0){
                result.append(recursion(x));
                result.append((char)(y+64));
            }
            else{
                result.append(recursion(x-1));
                result.append((char)(26+64));
            }

        }
        else{
            if(y!=0){
                if(x>0){
                    result.append((char)(x+64));
                }
                result.append((char)(y+64));
            }
            else{
                if(x>1){
                    result.append((char)(x+64-1));
                }
                result.append((char)(26+64));
            }

        }
        return result.toString();
    }
}

