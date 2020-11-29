import java.util.ArrayList;
import java.util.HashMap;

public class main
{
    static HashMap<String,Users> usersHashMap;
    public static void main(String arg[])
    {
        usersHashMap = new HashMap<>();
        Users user1=new Users();
        user1.setUid("u1");
        user1.setuName("User1");
        user1.setListofFriends(new HashMap<>());
        usersHashMap.put("u1",user1);

        Users user2=new Users();
        user2.setUid("u2");
        user2.setuName("User2");
        user2.setListofFriends(new HashMap<>());
        usersHashMap.put("u2",user2);

        Users user3=new Users();
        user3.setUid("u3");
        user3.setuName("User3");
        user3.setListofFriends(new HashMap<>());
        usersHashMap.put("u3",user3);


        ExpensesAdd expensesAdd1=new ExpensesAdd();
        Bill bill = new Bill();
        bill.setUid("u1");
        ArrayList<Users> involved=new ArrayList<>();
        involved.add(user2);
        involved.add(user3);
        bill.setInvolvedUser(involved);
        bill.setMoneyPaid(100);
        expensesAdd1.addPaidMoney(bill,usersHashMap);
        expensesAdd1.showExpense(user3);

    }
}
