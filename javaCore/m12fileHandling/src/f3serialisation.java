import java.io.*;

public class f3serialisation {
    public static void main(String[] args) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/cust.txt"));
            Customer c1= new Customer("customer", 12);
            o.writeObject(c1);
            o.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/sandeep kumar/OneDrive/Desktop/java/javaCore/m10fileHandling/src/cust.txt"));
            Customer c2= (Customer)in.readObject();
            System.out.println(c2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Customer implements Serializable {
    String name;
    Integer id;
    Customer(String name,Integer id){
        this.name=name;
        this.id=id;
    }
    //@Override
    public String toString(){
        @SuppressWarnings("unused")
        int i;
        return "Name of customer::"+this.name+" and id is ::"+this.id;
    }
}
