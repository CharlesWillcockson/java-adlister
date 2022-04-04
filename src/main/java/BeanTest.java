public class BeanTest {
    public static void main(String[] args) {
        Album sublime = new Album();
        sublime.setId(1);
        sublime.setArtist("Sublime");
        sublime.setName("Sublime");
        sublime.setReleaseDate(1996, 12, 23);
        sublime.setSales(28);
        sublime.setGenre("Reggae ish");

        System.out.println(sublime.getSales());

        Author twain = new Author();
        twain.setFirstName("Samuel");
        twain.setLastName("Clemens");

        Quote twain1 = new Quote();
        twain1.setAuthor(twain.getFirstName() + " " + twain.getLastName());
        twain1.setQuote("Some stuff Huck Finn said");

        System.out.println(twain1.getAuthor());
    }
}
