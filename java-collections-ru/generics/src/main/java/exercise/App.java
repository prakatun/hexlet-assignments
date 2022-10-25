package exercise;

import java.util.*;

// BEGIN
class App {
    public static <T> void main(String[] args) {
        List<Map<String, String>> books = new ArrayList<>();

        Map<String, String> book1 = new HashMap<>(
                Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611")
        );
        Map<String, String> book2 = new HashMap<>(
                Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111")
        );
        Map<String, String> book3 = new HashMap<>(
                Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611")
        );
        Map<String, String> book4 = new HashMap<>(
                Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222")
        );
        Map<String, String> book5 = new HashMap<>(
                Map.of("title", "Still foooing", "author", "FooBar", "year", "3333")
        );

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Map<String, String> where = new HashMap<>(Map.of("author", "Shakespeare", "year", "1611"));

        App.findWhere(books, where);
    }

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> resultBooks = new ArrayList<>();

        for (Map<String, String> bs : books) {
            for (Map.Entry<String, String> sr : where.entrySet()) {

                if (bs.containsKey(sr.getKey()) && bs.containsValue(sr.getValue())) {
                    if (!resultBooks.contains(bs)) {
                        resultBooks.add(bs);
                    }
                } else {
                    resultBooks.remove(bs);
                    break;
                }

            }
        }
        return resultBooks;
    }
}
//END

