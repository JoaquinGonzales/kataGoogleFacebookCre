import java.util.Map;

public class CREUserIterator implements Iterator {

    int position;
    private Map<Integer, UserData> iterator;

    public CREUserIterator() {
        this.position = 0;
        this.iterator = CREApi.getCREinfo();
    }

    @Override
    public boolean isDone() {
        return position >= iterator.size();
    }

    @Override
    public String currentItem() {
        return String.valueOf(iterator.get(++position).toString());
    }
}
