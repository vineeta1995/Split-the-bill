import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesAdd
{
    public void addPaidMoney(Bill bill, HashMap<String, Users> usersHashMap)
    {
        String users = bill.getUid();
        Users user = usersHashMap.get(users);
        System.out.println("user :" + user.getUid());
        ArrayList<Users> involved = bill.getInvolvedUser();
        HashMap<Users, Integer> friends = user.getListofFriends();
        int totalFriends = bill.involvedUser.size();
        int moneyPaid =  bill.getMoneyPaid()/totalFriends;
        for(Users userInvolve : involved)
        {
            System.out.println("userInvolve " + userInvolve.getUid());
            if(!(userInvolve.equals(user)))
            {
            if(friends.containsKey(userInvolve))
            {
                int current = friends.get(userInvolve.getUid());
                current = current - moneyPaid;
                friends.put(userInvolve,current);  // add in current
                HashMap<Users, Integer> friend = userInvolve.getListofFriends();
                if(friend.containsKey(users))
                {
                    current = friend.get(userInvolve.getUid());
                    current = current + moneyPaid;
                    friend.put(user,current);
                }
                else
                {
                    friend.put(user,moneyPaid);
                }
            }
            else
            {
                friends.put(userInvolve,-1*moneyPaid);
                HashMap<Users, Integer> involvedUserFriend = userInvolve.getListofFriends();
                involvedUserFriend.put(user,moneyPaid);
                userInvolve.setListofFriends(involvedUserFriend);
            }
            }
        }
    }

    public void showExpense(Users uid)
    {
        HashMap<Users, Integer> friends = uid.getListofFriends();
        friends.forEach((key,value) -> System.out.println(key.getuName() + " = " + value));
    }
}
