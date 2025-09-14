public class e1enumsDemo {

    enum week implements A{
        monday, tuesday, wednesday, thursday, friday, saturday,  sunday;

        week(){
            System.out.println("constructor for " +this);
        }
        // this is not public pr protected, only private or default
        // why? we don't want to create objects
        // this is not th enum concept

        @Override
        public void hello(){
            System.out.println("hii, how are you");
        }
    }

    public static void main(String[] args) {
//        week day = week.monday;
//        System.out.println(day);

//        for(week day : week.values()){
//            System.out.println(day);
//        }

//        week day = week.monday;
//        switch (day){
//            case monday -> System.out.println("today is monday");
//            case sunday -> System.out.println("today is sunday");
//            default -> System.out.println("its another day");
//        }

        week day = week.monday;
        day.hello();
    }
}

interface A{
    void hello();
}
