import java.util.Arrays;

public class g4wildcardExample<T extends Number> {
    private Object[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public g4wildcardExample(){
        this.arr = new Object[DEFAULT_SIZE];
    }

    // WildCard
//    public void getList(List<? extends Number> list){
//        // do something
//
//        // here you can only pass Number type
//    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        arr[size++] = num;
    }

    private boolean isfull(){
        return size == DEFAULT_SIZE;
    }

    private void resize(){
        Object[] temp = new Object[DEFAULT_SIZE * 2];
        for(int i=0; i<DEFAULT_SIZE; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public T get(int idx){
        return (T)(arr[idx]);
    }

    public void set(int idx, T value){
        arr[idx] = value;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        g4wildcardExample<Integer> list = new g4wildcardExample<>();
        for(int i=0; i<15; i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}
