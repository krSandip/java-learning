public class s3dynamicStack extends s2customStack{
    public s3dynamicStack(){
        super();
    }

    public s3dynamicStack(int size){
        super(size);
    }

    public boolean push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
