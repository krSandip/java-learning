public class o2objectDemo implements Cloneable{
    int val;
    String info;

    public o2objectDemo(int val, String info) {
        this.val = val;
        this.info = info;
    }

    public o2objectDemo() {
        this.val = 0;
        this.info = "info";
    }

    public static void main(String args[]) {
        try {
            o2objectDemo o = new o2objectDemo(10, "Hello");
            System.out.println("o's values are " + o.val + "::" + o.info);

            o2objectDemo o2 = new o2objectDemo(20, "New Value");
            System.out.println("o and o2's comparison " + o.equals(o2));

            o2objectDemo o3 = (o2objectDemo) o.clone();
            System.out.println("o and o3's comparison " + o.equals(o3));

            System.out.println("O's hashcode value is "+o.hashCode());
            System.out.println("O2's hashcode value is "+o2.hashCode());
            System.out.println("O3's hashcode value is "+o3.hashCode());
            System.gc();
        } catch (Exception e) {
            System.err.println("hi");
            e.printStackTrace();
        }

    }

    protected void finalize(){
        System.out.println("Inside Object demo's finalize method " );
    }
    public int hashCode(){
        int code=1;
        code = code * 11 + val;
        code = code *13 + info.hashCode();
        return code;
    }

    public boolean equals(o2objectDemo obj) {
        if ((this.val == obj.val) && (this.info == obj.info)) {
            return true;
        } else {
            return false;
        }
    }
}
