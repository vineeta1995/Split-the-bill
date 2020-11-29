import java.util.ArrayList;

public class Bill
{
    private String uid;
    private int moneyPaid;
    ArrayList<Users> involvedUser;
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(int moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public ArrayList<Users> getInvolvedUser() {
        return involvedUser;
    }

    public void setInvolvedUser(ArrayList<Users> involvedUser) {
        this.involvedUser = involvedUser;
    }
}
