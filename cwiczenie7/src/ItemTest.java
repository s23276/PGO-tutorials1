import java.util.ArrayList;
import java.util.HashMap;

public class ItemTest {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Pen"));
        items.add(new Item(2, "Notebook"));
        items.add(new Item(3, "Eraser"));
        items.add(new Item(4, "Ruler"));
        items.add(new Item(5, "Marker"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (HashMap.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
