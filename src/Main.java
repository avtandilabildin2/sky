public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Aleksandr", "Pushkin");
        Author tolstoi=new Author("Lev", "Tolstoi");
        Book ryba=new Book("Ryba",pushkin,1900);
        Book mir=new Book("Mir",tolstoi,1900);
        mir.setDateCreated(1800);
    }
}
