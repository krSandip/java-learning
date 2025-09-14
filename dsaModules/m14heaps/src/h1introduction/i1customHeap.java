package h1introduction;

import java.util.ArrayList;

public class i1customHeap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public i1customHeap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index - 1) / 2;
    }
    private int left(int index){
        return (index * 2) + 1;
    }
    private int right(int index){
        return (index * 2) + 2;
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size() - 1);
    }
    private void upHeap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("list Empty!!");
        }
        T removed = list.remove(0);
        if(!list.isEmpty()){
            list.set(0, list.get(list.size()-1));
            downHeap(0);
        }
        return removed;
    }
    private void downHeap(int index){
        int min = index;
        int left = left(min);
        int right = right(min);
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index){
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

    public void display(){
        System.out.println(list);
    }


    public static void main(String[] args) {
        i1customHeap minHeap = new i1customHeap();
        for(int i=23; i>14; i--){
            minHeap.insert(i);
        }
        minHeap.display();
    }
}
