import java.util.Arrays;

public class a3customArrList {
    private int[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public a3customArrList(){
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        arr[size++] = num;
    }

    private boolean isfull(){
        return size == DEFAULT_SIZE;
    }

    private void resize(){
        int[] temp = new int[DEFAULT_SIZE * 2];
        for(int i=0; i<DEFAULT_SIZE; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public int get(int idx){
        return arr[idx];
    }

    public void set(int idx, int value){
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
        a3customArrList list = new a3customArrList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);

        for(int i=0; i<15; i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}
