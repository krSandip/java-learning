import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class l6addBookMenu {

    public static void addBookMenu() {
        System.out.println("Reached Inside The Book Menu");
        l7bookClass b = new l7bookClass();
        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                System.out.println("Enter isbn code : ");
                b.setIsbnCode(sc.nextLine().toString());
                System.out.println("Enter book name : ");
                b.setBookName(sc.nextLine().toString());
                System.out.println("Enter book desc : ");
                b.setBookDesc(sc.nextLine().toString());
                System.out.println("Enter author name : ");
                b.setAuthorName(sc.nextLine().toString());
                System.out.println("Enter subject : ");
                b.setSubjectName(sc.nextLine().toString());
                System.out.println("Enter units available : ");
                b.setUnitsAvailable(Integer.parseInt(sc.nextLine().toString()));

                addBook(b);
                addStatus = 1;

            } catch (Exception e) {
                addStatus=0;
            }

        }

    }

    public static void addBook(l7bookClass b) {
        System.out.println("Reached Inside Add Book For Book : " +b.getIsbnCode());
        Connection conn = l2libraryUtil.getConnection();
        try {
            Statement stmt = conn.createStatement();
            int k = stmt.executeUpdate("insert into books values ('"+b.getIsbnCode()+"','"+b.getBookName()+"','"+b.getBookDesc()+"',"
                    + "'"+b.getAuthorName()+"','"+b.getSubjectName()+"',"+b.getUnitsAvailable()+")");
            if(k>0){
                System.out.println("Book Added Successfully !!");
                conn.commit();
            }else{
                conn.rollback();
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

