import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ItemSublistTest {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            items.add(new Item(i, "Item" + i));
        }

        List<Item> sublist = items.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(sublist);

        for (Item item : itemSet) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }
    }
}
