package exercise;

import java.util.List;

// BEGIN
public class App {

    private static final List<String> FREE = List.of("gmail.com", "yandex.ru", "hotmail.com");

    public static long getCountOfFreeEmails(List<String> emailsList) {
        return emailsList
                .stream()
                .map(mail -> mail.split("@")[1])
                .filter((FREE::contains))
                .count();
    }
}

// END

