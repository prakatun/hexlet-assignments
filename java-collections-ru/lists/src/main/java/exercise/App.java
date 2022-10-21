package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static void main(String[] args) {

    }
    public static boolean scrabble(String str, String word) {
        List<String> list1 = new ArrayList<>(List.of(str.split("")));
        List<String> list2 = new ArrayList<>(List.of(word.toLowerCase().split("")));

        for (String s : list1) {
            list2.remove(s);
        }
        return list2.size() == 0;
    }
}
//END
