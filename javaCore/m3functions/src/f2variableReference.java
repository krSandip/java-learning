import java.util.Arrays;

public class f2variableReference {

    public static void changeVariableValue(int a){
        a = a + 10;
        System.out.println("inside changeVariableValue method and value of a is inside "+a);
    }

    public static void changeVariableValue(testRefVar a){
        a.val = 19;
        System.out.println("inside changeVariableValue method and value of refVar is inside "+a.val);
    }

    static void change(int[] arr2){
        arr2[0] = 77;                      // here we are changing the object or value
    }

    public static void main(String[] args) {
        int a = 4;
        System.out.println("Value of a before calling is  "+a);
        changeVariableValue(a);
        System.out.println("Value of a after calling is  "+a);

        testRefVar refVar=new testRefVar();
        refVar.val = 4;
        System.out.println("Value of refVar before calling is  "+refVar.val);
        changeVariableValue(refVar);
        System.out.println("Value of refVar after calling is  "+refVar.val);

        int [] arr1 = {1, 3, 5, 2, 7};
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}

class testRefVar{
    int val;
}