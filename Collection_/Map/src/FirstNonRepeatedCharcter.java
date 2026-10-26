import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatedCharcter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Swiss Programming");

        Map<Character, Integer> map = new HashMap<>();

        for (String s : list) {
            String lower = s.toLowerCase();

            for (int i = 0; i < lower.length(); i++) {

                char ch = lower.charAt(i);

                if (!Character.isLetter(ch)) {
                    continue;
                }

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            for (int i = 0; i < lower.length(); i++) {

                char ch = lower.charAt(i);

                // Ignore spaces and special characters
                if (!Character.isLetter(ch)) {
                    continue;
                }

                if (map.get(ch) == 1) {
                    System.out.println(
                            "First Non-Repeated Character = " + ch
                    );
                    break;
                }
            }
        }
    }


}
