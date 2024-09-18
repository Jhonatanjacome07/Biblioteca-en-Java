import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   private static List<Item> items = new ArrayList<>();
    private static List<User> users = new ArrayList<>();

    public static void addItem(Item item) {
        items.add(item);
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static void listItems() {
        for (Item item : items) {
            item.showDetails();
        }
    }
}
