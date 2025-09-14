import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class l8libraryFunctions {

    public static void callIssueMenu() {
        System.out.println("Reached Inside Issue Book Menu");
        l5memberClass m = new l5memberClass();
        l7bookClass b = new l7bookClass();
        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                System.out.println("Enter Member id : ");
                m.setMemberId(Integer.parseInt(sc.nextLine().toString()));
                System.out.println("Enter isbn code : ");
                b.setIsbnCode(sc.nextLine().toString());
                issueBook(m, b);
                addStatus = 1;

            } catch (Exception e) {
                addStatus = 0;
            }

        }

    }


    public static void issueBook(l5memberClass m, l7bookClass b) {
        Connection conn = l2libraryUtil.getConnection();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = null;
            String qry = "select m.member_id, b.isbn_code, mbr.record_id from members as m,books as b,member_book_record as mbr\n"
                    + "where m.member_id= " + m.getMemberId() + " \n"
                    + "and b.isbn_code = '" + b.getIsbnCode() + "' \n"
                    + "and m.member_id=mbr.member_id\n"
                    + "and b.isbn_code=mbr.isbn_code and mbr.dor is null ";
            rs=stmt.executeQuery(qry);
            if (rs.next()) {
                System.out.println("The Book Is Already Issued And Cannot Be Issued Again !!");
            } else {
                int k = stmt.executeUpdate("insert into member_book_record (member_id, isbn_code, doi, dor) " +
                        "values (" + m.getMemberId() + ", '" + b.getIsbnCode() + "', CURDATE(), null)");

                if(k > 0){
                    k = stmt.executeUpdate("update books set units_available= (units_available-1) where isbn_code = '"+ b.getIsbnCode() +"' ");
                    System.out.println("Book Issued Successfully !!");
                }
                else{
                    conn.rollback();
                }

            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void callReturnMenu() {
        System.out.println("Reached Inside Return Book Menu");
        l5memberClass m = new l5memberClass();
        l7bookClass b = new l7bookClass();
        Scanner sc = new Scanner(System.in);
        int addStatus = 0;

        while (addStatus == 0) {
            try {
                System.out.println("Enter Member id : ");
                m.setMemberId(Integer.parseInt(sc.nextLine().toString()));
                System.out.println("Enter isbn code : ");
                b.setIsbnCode(sc.nextLine().toString());
                returnBook(m, b);
                addStatus = 1;

            } catch (Exception e) {
                addStatus = 0;
            }

        }

    }

    public static void returnBook(l5memberClass m, l7bookClass b) {
        Connection conn = l2libraryUtil.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = null;
            String qry = "select m.member_id, b.isbn_code, mbr.record_id from members as m,books as b,member_book_record as mbr\n"
                    + "where m.member_id= " + m.getMemberId() + " \n"
                    + "and b.isbn_code = '" + b.getIsbnCode() + "' \n"
                    + "and m.member_id=mbr.member_id\n"
                    + "and b.isbn_code=mbr.isbn_code and mbr.dor is null ";
            rs=stmt.executeQuery(qry);
            if (rs.next()) {
                Integer recId= rs.getInt(3);
                System.out.println("Starting The Process To Return The Book...");
                int k = stmt.executeUpdate("update books set units_available= (units_available-1) where isbn_code = '"+ b.getIsbnCode() +"' ");
                if(k > 0){
                    k = stmt.executeUpdate("update member_book_record set dor= NOW() where record_id = "+ recId +" ");
                    //conn.commit();
                    System.out.println("Book Returned Successfully !!");
                }else{
                    conn.rollback();
                }

            } else{
                System.out.println("This Book Is Not Issued For The User !!");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
