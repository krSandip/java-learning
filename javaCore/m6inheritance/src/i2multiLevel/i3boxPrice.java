package i2multiLevel;

public class i3boxPrice extends i2boxWeight{
    int price;

    i3boxPrice(){
        super();
        this.price = 100;
    }

    i3boxPrice(int length, int breadth, int height, int weight, int price){
        super(length, breadth, height, weight);
        this.price = price;
    }

    i3boxPrice(int side, int weight, int price){
        super(side, weight);
        this.price = price;
    }

    i3boxPrice(i3boxPrice other){
        super(other);
        this.price = other.price;
    }
}
