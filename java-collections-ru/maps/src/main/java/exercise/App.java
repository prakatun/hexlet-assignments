package exercise;

import java.util.*;

// BEGIN
public class App {
    public static void main(String[] args) {
        String sentence = "word text cat apple word map apple word";
        Map<String, Integer> wordsCount = App.getWordCount(sentence);
        String result = App.toString(wordsCount);
        System.out.println(result);
    }

    public static Map<String, Integer> getWordCount(String str) {

        List<String> list = new ArrayList<>(List.of(str.split(" ")));
        Set<String> Word = new HashSet<>(list);
        Map<String, Integer> countWord = new HashMap<>();
        if (str.length() == 0) {
            return countWord;
        }

        for (String key : Word) {
            countWord.put(key, Collections.frequency(list, key));
        }
        return countWord;
    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder str = new StringBuilder();
        str.append("{");
        if (map.size() == 0) {
            str.append("}");
            return str.toString();
        }
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            str.append("\n  ").append(value.getKey()).append(": ").append(value.getValue());
        }
        str.append("\n}");
        return String.valueOf(str);
    }
}
//END

