public class b7rightMostSetBit {
    public static void main(String[] args) {
        int n =40;
        System.out.println(getPosition2(n));
    }

    // using 2's complement method
    static int getPosition1(int n){
        int x = n & -n;
        return (int)((Math.log(x))/(Math.log(2.0))+1);
    }

    // using & operator and left shift operator
    static int getPosition2(int n){
        int position = 1;
        int m = 1;
        while((n & m) == 0){
            m = m << 1;
            position++;
        }
        return position;
    }
}
