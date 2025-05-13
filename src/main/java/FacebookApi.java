import java.util.Arrays;
import java.util.List;

public class FacebookApi {

    public static List<FacebookUser> getFacebookUser()
    {
        List<FacebookUser> facebbookUsers = Arrays.asList(
                new FacebookUser("Joaquin"),
                new FacebookUser("LuisF"),
                new FacebookUser("Gustavo"));
        return facebbookUsers;
    }
}
