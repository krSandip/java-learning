public class n3localDemo {
    public static void main(String[] args) {
        //        test();
    }

    static void test(){
        class localInner{
            String str;
            //="local inner string";
            void printStr(){
            }
        }
        localInner i = new localInner();
        i.printStr();


    }
}