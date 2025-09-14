public class c1classDemo {
    public static void main(String[] args) {
        int mb =1024*1024;
        String s1=new String("hello strings");
        String s2=new String("hello again");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Used Memory before starting:"+ (runtime.totalMemory() - runtime.freeMemory()) );
        System.out.println("Free Memory before starting:"+ (runtime.freeMemory()) );
        int i=1;
        while(i<10){
            s1+=s2;
            i++;
        }
        System.out.println("Used Memory after starting:"+ (runtime.totalMemory() - runtime.freeMemory()) / mb);
        System.out.println("Free Memory after starting:"+ (runtime.freeMemory()) / mb);
    }
}
