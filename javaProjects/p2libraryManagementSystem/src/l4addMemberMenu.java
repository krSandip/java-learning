import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class l4addMemberMenu {

    public static void addMemberMenu() {
        System.out.println("Reached Inside The Member Menu");
        l5memberClass m = new l5memberClass();
        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                System.out.println("Enter Member id : ");
                m.setMemberId(Integer.parseInt(sc.nextLine().toString()));
                System.out.println("Enter Member Name : ");
                m.setMemberName(sc.nextLine().toString());

                addMember(m);
                addStatus = 1;

            } catch (Exception e) {
                addStatus=0;
            }
        }
    }

    public static void addMember(l5memberClass m) {
        System.out.println("Reached Inside Add member For Member : " +m.getMemberId());
        Connection conn = l2libraryUtil.getConnection();
        try {
            Statement stmt = conn.createStatement();
            int k = stmt.executeUpdate("insert into members values ("+m.getMemberId()+",'"+m.getMemberName()+"',now())");
            if(k>0){
                System.out.println("Member Added Successfully !!");
                //conn.commit();
            }else{
                conn.rollback();
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

