import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shelf {
    private final List<Item> items = new ArrayList<>();

    public boolean add(Item item) {
        if (item == null) return false;
        if (items.contains(item)) return false;
        items.add(item);
        return true;
    }

    public boolean remove(Item item) {
        return items.remove(item);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(new ArrayList<>(items));
    }

    public int size() {
        return items.size();
    }
}
