import java.time.LocalDateTime;
import java.util.Optional;

public class Article {
    private String name;
    private int ID;
    private Optional<LocalDateTime> pulishedDate;

    public Article(String name, int ID, Optional<LocalDateTime> pulishedDate) {
        this.name = name;
        this.ID = ID;
        this.pulishedDate = pulishedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Optional<LocalDateTime> getPulishedDate() {
        return pulishedDate;
    }

    public void setPulishedDate(Optional<LocalDateTime> pulishedDate) {
        this.pulishedDate = pulishedDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", age=" + ID +
                ", pulishedDate=" + pulishedDate +
                '}';
    }
}
