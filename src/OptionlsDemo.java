import java.time.LocalDateTime;
import java.util.Optional;

public class OptionlsDemo {
//    pulic BiConsumer<Integer, Integer> sumConsumer = (a1, a2) -> System.out.println(a1 + a2);
    private static Optional<Article> getArticle() {
        return Optional.of(new Article("Ashish", 16, Optional.of(LocalDateTime.now())));
    }

    private static Optional<Article> getEmptyArticle() {
        return Optional.empty();
    }

    private static Optional<Article> getNewArticle() {
        return Optional.of(new Article("Katrina", 14, Optional.of(LocalDateTime.now())));
    }

    public static void main(String[] args) {
         Optional<Article> article = getArticle();

        Optional<Article> newArticle = getNewArticle();
         article.ifPresent(OptionlsDemo::printResult);

         Optional<Article> emptyArticle = getEmptyArticle();
         printResult(emptyArticle.orElseGet(() -> getArticle().get()));

         Article name = article.filter(article1 -> article1.getID()<15).orElseGet(() -> getNewArticle().get());
         printResult(name);

         Optional<String> articleName = newArticle.filter(article1 -> article1.getID()<15).map(Article::getName);
         articleName.ifPresent(System.out::println);

         Optional<Optional<LocalDateTime>> date = article.map(Article::getPulishedDate);
         date.ifPresent(d -> {d.ifPresent(System.out::println);});

         Optional<LocalDateTime> date2 = article.flatMap(Article::getPulishedDate);
         date2.ifPresent(System.out::println);
    }

    private static void printResult(Article article1) {
        System.out.println(article1.toString());
    }
}
