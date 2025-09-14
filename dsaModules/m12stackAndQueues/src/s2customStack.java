import javax.xml.crypto.Data;
import java.util.Arrays;

public class s2customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;


    public s2customStack(){
        this(DEFAULT_SIZE);
    }
    public s2customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("cannot pop from empty stack is empty!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peak() throws Exception{
        if (isEmpty()){
            throw new Exception("cannot peak from empty stack!!");
        }
        return data[ptr];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty!!");
        }
        System.out.println(Arrays.toString(data));
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == - 1;
    }

}
