import java.util.List;

public class FacebookUserIterator implements Iterator {
    private int position;
    private List<FacebookUser> facebookUsers;

    public FacebookUserIterator() {
        this.position = 0;
        this.facebookUsers = FacebookApi.getFacebookUser();
    }

    @Override
    public boolean isDone() {
        return this.position >= this.facebookUsers.size();
    }

    @Override
    public String currentItem() {
        return this.facebookUsers.get(this.position++).toString();
    }
}
