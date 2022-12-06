package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> user) {
        return user
                .stream()
                .filter(male -> male.get("gender").equals("male"))
                .sorted(Comparator.comparingLong(male -> LocalDate.parse(male.get("birthday")).toEpochDay()))
                .map(male -> male.get("name"))
                .toList();
    }
}
// END
