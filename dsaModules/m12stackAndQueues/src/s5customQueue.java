import java.util.Arrays;

public class s5customQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = 0;

    public s5customQueue(){
        this(DEFAULT_SIZE);
    }
    public s5customQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return ptr == data.length;
    }

    public boolean isEmpty() {
        return ptr == 0;
    }

    public boolean add(int item) throws Exception{
        if(isFull()){
            throw new Exception("cannot add item as queue is full!!");
        }
        data[ptr] = item;
        ptr++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[0];
        for(int i=1; i<ptr; i++){
            data[i-1] = data[i];
        }
        ptr--;
        return removed;
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot display item as queue is empty!!");
        }
        System.out.println(Arrays.toString(data));
    }
}
