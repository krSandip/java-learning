import java.sql.Date;

public class l5memberClass {

    private Integer memberId;
    private String memberName;
    private Date dateOfJoining;

    public l5memberClass() {

    }

    public l5memberClass(Integer memberId, String memberName, Date dateOfJoining) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.dateOfJoining = dateOfJoining;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

}

