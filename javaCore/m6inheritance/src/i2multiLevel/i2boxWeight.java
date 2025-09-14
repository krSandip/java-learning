package i2multiLevel;

public class i2boxWeight extends i1box{
    int weight;

    i2boxWeight(){
        super();
        this.weight = 10;
    }

    i2boxWeight(int length, int breadth, int height, int weight){
        super(length, breadth, height);  // it calls the constructor of parent class used to initialise values of parent class
        this.weight = weight;
    }
    i2boxWeight(int side, int weight){
        super(side);
        this.weight = weight;
    }

    i2boxWeight(i2boxWeight boxChild){
        super(boxChild);
        this.weight = boxChild.weight;
    }
}
