import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(i);
            System.out.println(list.get(i));
        }
    }
}
