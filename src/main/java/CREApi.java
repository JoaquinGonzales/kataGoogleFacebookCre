import java.util.HashMap;
import java.util.Map;

public class CREApi {
    public static Map<Integer, UserData> getCREinfo()
    {
        Map<Integer, UserData> creUsers = new HashMap<>();
        UserData userData1 = new UserData("Joaquin", "test123", 1001.0);
        UserData userData2 = new UserData("Luis", "test1234", 1002.0);
        UserData userData3 = new UserData("Gustavo", "test1233", 1003.0);
        CREUser creUser1 = new CREUser(1, userData1);
        CREUser creUser2 = new CREUser(2, userData2);
        CREUser creUser3 = new CREUser(3, userData3);

        creUsers.put(creUser1.getId(), userData1);
        creUsers.put(creUser2.getId(), userData2);
        creUsers.put(creUser3.getId(), userData3);

        return creUsers;
    }
}
