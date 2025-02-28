/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

public class Movie extends MD {
    private String director;
    private boolean rented;

    public Movie(String title, int year, String director) {
        super(title, year);
        this.director = director;
        this.rented = false;
    }

    @Override
    public String getDetails() {
        return String.format("Movie: %s directed by %s (%d)", getTitle(), director, getYear());
    }

    @Override
    public void rent() {
        if (!rented) rented = true;
        else System.out.println("Movie already rented.");
    }

    @Override
    public void returnItem() { rented = false; }

    @Override
    public boolean isRented() { return rented; }
}