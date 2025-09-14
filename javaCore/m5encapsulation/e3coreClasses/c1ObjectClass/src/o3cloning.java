import java.util.Arrays;

public class o3cloning implements Cloneable{
    String name;
    int age;
    int[] arr;

    public o3cloning(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{2,4,5,1,0};
    }

//    public c1human(c1human other){
//        this.name = other.name;
//        this.age = other.age;
//    }

//    public Object clone() throws CloneNotSupportedException{
//        // shallow copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        // this is actually shallow copy
        o3cloning twin = (o3cloning) super.clone();
        // make deep copy
        twin.arr = new int[twin.arr.length];
        for(int i=0; i<twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        o3cloning human1 = new o3cloning("sandeep", 20);
//        c1human twin = new c1human(human1);

        // simple cloning using clone() method of object class
        o3cloning twin = (o3cloning) human1.clone();
        System.out.println(twin.name+ " " +twin.age);
        System.out.println(Arrays.toString(human1.arr));
        System.out.println(Arrays.toString(twin.arr));

//        // shallow copy
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(human1.arr));
        System.out.println(Arrays.toString(twin.arr));

        //deep copy
        twin.arr[0] = 200;
        System.out.println(Arrays.toString(human1.arr));
        System.out.println(Arrays.toString(twin.arr)); //
    }

}
