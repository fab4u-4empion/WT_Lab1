package Task12_15;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook that = (ProgrammerBook) o;
        return level == that.level &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "ProgrammerBook{\n" +
                "\ttitle : '" + title + "',\n" +
                "\tauthor : '" + author + ", \n" +
                "\tprice : " + price + "\n" +
                "\tisbn : " + isbn + "\n" +
                "\tlanguage : " + language + "\n" +
                "\tlevel : " + level + "\n" +
                '}';
    }
}
