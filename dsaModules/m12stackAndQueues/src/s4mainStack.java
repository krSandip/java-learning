public class s4mainStack {
    public static void main(String[] args) throws Exception {
        s2customStack stack = new s3dynamicStack(5);
        for(int i=20; i<25; i++){
            stack.push(i);
        }
        stack.display();
        stack.push(30);
        stack.display();
        System.out.println(stack.pop());
        stack.push(40);
        stack.display();
    }
}
