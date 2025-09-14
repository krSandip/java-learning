public class s8dynamicQueue extends s7circularQueue{
    public s8dynamicQueue(){
        super();
    }

    public s8dynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean add(int item){
        if(isFull()){
            int[] temp = new int[data.length * 2];
            for(int i=0; i<data.length; i++){
                temp[i] = data[(i+s) % data.length];
            }
            s = 0;
            e = data.length;
            data = temp;
        }

        return super.add(item);
    }
}
