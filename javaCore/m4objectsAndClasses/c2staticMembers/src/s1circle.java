public class s1circle {
    static double pi ;

    int radius;

    static{
        System.out.println("Class's static bloack is getting init ");
        pi=3.14;
    }

    public s1circle(int radius){
        this.radius=radius;
        System.out.println("Inside constructor");
    }
    public static double returnAreaFormula(String s, int n){
        return pi;
    }

    public static void main(String args[]){
        s1circle c1= new s1circle(5);
        s1circle c2= new s1circle(5);

        int val1=10;
        int val2=10;

        System.out.println("c1 is "+c1);
        System.out.println("c2 is "+c2);
        System.out.println("Comparing ca & c2 returns "+(c2.equals(c1)));
        System.out.println("Comparing val1 & val2 returns "+(val1==val2));
    }
    public boolean equals(s1circle obj){
        if(this.getClass() != obj.getClass()) return false;
        else if (this.radius != obj.radius) return false;
        else return true;
    }
}
