public class s7circularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int s=0;
    int e=0;
    int size=0;

    public s7circularQueue(){
        this(DEFAULT_SIZE);
    }

    public s7circularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean add(int item){
        if(isFull()){
            return false;
        }
        data[e++] = item;
        e = e % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[s++];
        s = s % data.length;
        size--;
        return removed;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int i=0;
        do{
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        }while(i != e);
        System.out.println("END");
    }
}
