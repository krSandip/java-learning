public class c2finalKeyword {
    private final String name;

    public c2finalKeyword(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        c2finalKeyword name1 = new c2finalKeyword("anup");

        //name1.name = "sandip";
        System.out.println(name1.getName());
    }
}
