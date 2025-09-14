public class f5overloading {
    int base;
    int height;
    int s1;int s2; int s3;

    public f5overloading(int base, int height){
        this.base=base;
        this.height=height;
    }
    public f5overloading(int s1, int s2,int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public double getArea(int base, int height)
    {
        System.err.println("Get Area with 2 args");
        return (0.5*base*height);
    }

    public double getArea(int base, int height, String val)
    {
        System.err.println("Get Area with string args");
        return (0.5*base*height);
    }
    public double getArea(int base, String val,int height)
    {
        System.err.println("Get Area with string args");
        return (0.5*base*height);
    }
    public double getArea(int s1, int s2, int s3)
    {
        System.err.println("Get Area with 3 args");
        return (0.7*s1*s2*s3);
    }

    public static void main(String args[]){
        f5overloading rightTriangle= new f5overloading(4, 3);
        rightTriangle.getArea(4,3);

        f5overloading secondTriangle= new f5overloading(4, 3, 5);
        secondTriangle.getArea(4,3,5);

    }
}
