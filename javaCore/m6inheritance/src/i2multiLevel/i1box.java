package i2multiLevel;

public class i1box {
    int l;
    int b;
    int h;

    public i1box() {
        this.l = -1;
        this.b = 0;
        this.h = 1;
    }

    public i1box(int length, int breadth, int height){
        this.l = length;
        this.b = breadth;
        this.h = height;
    }

    public i1box(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    public i1box(i1box box){
        this.l = box.l;
        this.b = box.b;
        this.h = box.h;
    }
}
