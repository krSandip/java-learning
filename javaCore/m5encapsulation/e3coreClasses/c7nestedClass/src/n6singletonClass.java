public class n6singletonClass {
    public static void main(String[] args) {
        singleton obj1 = singleton.getInstance();

        System.out.println(obj1.getName());
        // all 3 variables are pointing to just one object
    }
}

class singleton{
    private String name;

    singleton(String name){
        this.name = name;
    }

    private static singleton obj;

    public static singleton getInstance(){
        if(obj == null){
            obj = new singleton("sandeep");
        }
        return obj;
    }


    // getter
    public String getName(){
        return name;
    }

    // setter
    public void setName(){
        this.name = name;
    }
}
