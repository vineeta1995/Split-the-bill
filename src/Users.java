import java.util.HashMap;

public class Users {

    private String uid;
    private String uName;

    public HashMap<Users, Integer> getListofFriends() {
        return listofFriends;
    }

    public void setListofFriends(HashMap<Users, Integer> listofFriends) {
        this.listofFriends = listofFriends;
    }

    private HashMap<Users,Integer> listofFriends;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}
