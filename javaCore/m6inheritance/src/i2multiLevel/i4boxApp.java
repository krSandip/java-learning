package i2multiLevel;

public class i4boxApp {
    public static void main(String[] args) {
//        // case 1
//        i1Box box1 = new i1Box();
//        i1Box box2 = new i1Box(1,2,3 );
//        i1Box box3 = new i1Box(5);
//        i1Box box4 = new i1Box(box1);
//        System.out.println(box4.h);
//
//        // case 2
//        i3boxChild child1 = new i3boxChild();
//        i3boxChild child2 = new i3boxChild(10, 20, 30,40);
//        i3boxChild child3 = new i3boxChild(90,100);
//        i3boxChild child4 = new i3boxChild(child2);
//        System.out.println(child1.l);
//
//        // case 3
//        i1Box child5 = new i3boxChild(100, 200, 300, 400);
//        System.out.println(child5.weight);
//        // it is not possible to access child class variables
//
//        System.out.println(child5.h);
//        // but it is possible to access parent class variables
//
//        // case 4
//        i3boxChild child6 = new i1Box(1,2,3);
//        // this gives error, not possible

        i3boxPrice price1 = new i3boxPrice();
        i3boxPrice price2 = new i3boxPrice(1,2,3,4,5);
        i3boxPrice price3 = new i3boxPrice(10,20,30);
        i3boxPrice price4 = new i3boxPrice(price2);
        System.out.println(price4.price);
    }
}
