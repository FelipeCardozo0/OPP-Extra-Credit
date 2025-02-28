/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/



public class Book extends MediaItem {
    private String author;
    private boolean rented;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
        this.rented = false;
    }

    @Override
    public String getDetails() {
        return String.format("Book: %s by %s (%d)", getTitle(), author, getYear());
    }

    @Override
    public void rent() {
        if (!rented) rented = true;
        else System.out.println("Book already rented.");
    }

    @Override
    public void returnItem() { rented = false; }

    @Override
    public boolean isRented() { return rented; }
}