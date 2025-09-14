public class m6gcdLcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int hcf = gcd(a,b);
        System.out.println("HCF = " +hcf + " and LCM = " + lcm(a,b,hcf));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a , a);
    }
    static int lcm(int a, int b, int hcf){
        // product of 2 numbers == product of hcf and lcm of these 2 numbers
        return (a*b) / hcf;
    }
}
